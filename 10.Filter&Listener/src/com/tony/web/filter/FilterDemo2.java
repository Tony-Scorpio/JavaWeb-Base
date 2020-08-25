package com.tony.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/24 11:24
 */

//@WebFilter("/*")
public class FilterDemo2 implements Filter {


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request对象请求消息增强
        System.out.println("filterDemo执行");

        //放行
        chain.doFilter(req, resp);
        //对response对象的响应消息增强
        System.out.println("filterDemo回来");
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
