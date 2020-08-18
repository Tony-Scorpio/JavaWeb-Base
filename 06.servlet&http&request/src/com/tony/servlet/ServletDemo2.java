package com.tony.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/18 10:00
 */

@WebServlet("/demo2")
public class ServletDemo2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("demo2");
    }


}
