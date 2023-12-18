package com.sh.servlet.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @Author: SH
 * @Date: 2023/12/13 20:45
 */
//@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获得session对象,获取session的id并判断此session是不是新的session
        HttpSession session = req.getSession();
        System.out.println("session.getId() = " + session.getId());
        System.out.println("session.isNew() = " + session.isNew());

        //读取session对象中存储的用户名和id
        String username = (String) session.getAttribute("username");
        String id = (String) session.getAttribute("id");
        System.out.println("servlet2 got username = " + username);
        System.out.println("servlet2 got id = " + id);
    }
}
