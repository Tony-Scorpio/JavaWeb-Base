package cn.tony.servlet;

import javax.servlet.*;
import java.io.IOException;
/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/18 8:07
 */

/**
 * Servlet快速入门
 */
public class ServletDemo1 implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //提供服务的方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
