package cn.make.web.servlet;

import cn.make.service.UserService;
import cn.make.service.impl.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSelectServlet")
public class DelSelectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有id
        String[] ids = request.getParameterValues("uid");
        //调用service删除
        UserService userService = new UserServiceImpl();
        userService.delSelectedUser(ids);

        //转发
        response.sendRedirect(request.getContextPath() + "/findUserByPageServlet");
    }
}
