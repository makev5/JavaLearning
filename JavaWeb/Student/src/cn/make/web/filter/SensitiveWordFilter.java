package cn.make.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

/**
 * 过滤敏感词
 */
@WebFilter("/*")
public class SensitiveWordFilter implements Filter {
    private List<String> list = new ArrayList<String>(); //敏感词汇

    public void init(FilterConfig config) throws ServletException {
        // 1.获取文件真实路径
        ServletContext servletContext = config.getServletContext();
        String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
        // 2.读取文件
        try {
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            // 3.将文件内容存入list
            String line = null;
            while ((line = br.readLine())!=null){
                list.add(line);
            }
            br.close();
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 1. 创建代理对象，增强getParameter方法
        ServletRequest proxy_req = (ServletRequest)Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法,判断是否是getParameter方法
                if (method.getName().equals("getParameter")){
                    //增强返回值
                    String value = (String)method.invoke(req, args);
                    if (value!=null){
                        for (String s : list) {
                            if (value.contains(s)){
                                value = value.replaceAll(s, "***");
                            }
                        }
                    }
                    return value;
                }



                //判断方法名是否是 getParameterMap
                if (method.getName().equals("getParameterMap")){
                    Map<String, String> map = (Map<String, String>) method.invoke(req, args);
                    Set<String> keySet = map.keySet();
                    for (String key : keySet) {
                        String value = map.get(key);
                        if (value!=null){
                            for (String s : list) {
                                if (value.contains(s)){
                                    value = value.replaceAll(s, "***");
                                }
                            }
                        }
                    }
                    return map;
                }

                //判断方法名是否是 getParameterValues
                if (method.getName().equals("getParameterValues")){
                    String[] Values = (String[]) method.invoke(req, args);
                    for (String value : Values) {
                        if (value!=null){
                            for (String s : list) {
                                if (value.contains(s)){
                                    value = value.replaceAll(s, "***");
                                }
                            }
                        }
                    }
                    return Values;
                }

                return method.invoke(req, args);

            }
        });
        // 2. 放行
        chain.doFilter(proxy_req, resp);
    }
}
