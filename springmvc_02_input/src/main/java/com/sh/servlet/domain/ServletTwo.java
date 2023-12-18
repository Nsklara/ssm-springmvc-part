package com.sh.servlet.domain;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @Author: SH
 * @Date: 2023/12/17 17:30
 * 获取三大域中的数据
 */
//@WebServlet("/servletTwo")
public class ServletTwo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求域中的数据
        //在知道返回值类型的情况下可以强转
        //getAttribute(String key)
        String request = (String) req.getAttribute("request");
        System.out.println("请求域 = " + request);

        //获取会话域中的数据
        HttpSession session = req.getSession();
        String sessionMassage = (String) session.getAttribute("session");
        System.out.println("会话域 = " + sessionMassage);

        //获取应用域中的数据
        ServletContext application = getServletContext();
        String applicationMassage = (String) application.getAttribute("application");
        System.out.println("应用域 = " + applicationMassage);
    }
}
