package com.tony.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/18 10:45
 */

@WebServlet("/servletContextDemo3")
public class ServletContextDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*

            ServletContext功能：
               1. 获取MIME类型：

                2. 域对象：共享数据
                3. 获取文件的真实(服务器)路径
         */
        
        //2. 通过HttpServlet获取
        ServletContext context = this.getServletContext();

        //设置数据
        context.setAttribute("msg","hh");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
