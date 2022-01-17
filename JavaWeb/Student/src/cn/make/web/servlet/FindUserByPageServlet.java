package cn.make.web.servlet;

import cn.make.domain.PageBean;
import cn.make.domain.User;
import cn.make.service.UserService;
import cn.make.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 获取参数
        String currentPage = request.getParameter("currentPage"); //当前页
        String rows = request.getParameter("rows"); // 每页条数
        if (currentPage == null || "".equals(currentPage)){
            currentPage = "1";
        }
        if (rows == null || "".equals(rows)){
            rows = "5";
        }
        //获取查询条件
        Map<String, String[]> condition = request.getParameterMap();

        //调用UserService查询
        UserService userService = new UserServiceImpl();
        PageBean<User> pageBean = userService.findUserByPage(currentPage, rows, condition);


        //将PageBean存入request域
        request.setAttribute("pageBean", pageBean);
        request.setAttribute("condition", condition);
        //转发list.jsp页面
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
