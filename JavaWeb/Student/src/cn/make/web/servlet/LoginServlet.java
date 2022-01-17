package cn.make.web.servlet;

import cn.make.domain.Admin;
import cn.make.service.AdminService;
import cn.make.service.impl.AdminServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("utf-8");

        //获取生成的验证码
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");//确保验证码一次性
        //获取用户输入的验证码
        String verifycode = request.getParameter("verifycode");

        //判断验证码
        if (verifycode.equalsIgnoreCase(checkcode_server)) {
            //验证码正确
            //获取所有请求参数
            Map<String, String[]> map = request.getParameterMap();
            //创建Admin对象
            Admin admin = new Admin();
            try {
                BeanUtils.populate(admin, map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            //调用调用Service查询
            AdminService adminService = new AdminServiceImpl();
            Admin loginAdmin = adminService.login(admin);
            //判断是否登录成功
            if (loginAdmin!=null){
                //登录成功,将信息存入session
                session.setAttribute("loginAdmin", loginAdmin);
                //跳转index页面
                response.sendRedirect(request.getContextPath() + "/index.jsp");
            }else {
                //登录失败
                request.setAttribute("login_msg", "账号或密码错误");
                //跳转登录页面
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }

        } else {
            //验证码错误,提示错误信息
            request.setAttribute("login_msg", "验证码错误");
            //跳转登录页面
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
