package com.tony.servlet;

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
 * Date: 2020/8/18 10:00
 */

@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据:referer

        String referer = request.getHeader("referer");
        System.out.println(referer);//http://localhost/login.html

        //防盗链
        if(referer != null ){
            if(referer.contains("/Tony")){
                //正常访问
               // System.out.println("播放电影.");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("播放电影");
            }else{
                //盗链
                //System.out.println("想看电影吗？想得美");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("想看电影吗？想得美");
            }
        }

    }
}
