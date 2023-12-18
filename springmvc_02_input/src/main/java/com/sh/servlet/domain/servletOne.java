package com.sh.servlet.domain;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @Author: SH
 * @Date: 2023/12/17 17:29
 * 向三大域中存放数据
 */
//@WebServlet("/servletOne")
public class servletOne extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //存放数据:
        /*
        setAttribute(String key,Object value)
         */

        //向请求域存放数据
        req.setAttribute("request","requestMassage");

        //向会话域存放数据
        //1.获取session
        HttpSession session = req.getSession();
        //2.存放数据
        session.setAttribute("session","sessionMassage");

        //向应用域存放数据
        //1.获取ServletContext
        ServletContext application = getServletContext();
        //2.存放数据
        application.setAttribute("application","applicationMassage");

        //TODO:测试
        //测试一次请求过程中获取请求域数据
        String request = (String) req.getAttribute("request");
        System.out.println("请求域 = " + request);

        //测试一次请求过程中,转发请求能否获取请求域数据
        //1.请求转发
//        req.getRequestDispatcher("servletTwo").forward(req,resp);
    }
}
