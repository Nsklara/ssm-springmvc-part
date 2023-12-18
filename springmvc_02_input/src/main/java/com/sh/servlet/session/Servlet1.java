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
//@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求中的username参数
        String name = req.getParameter("username");
        String id = req.getParameter("id");

        //获得session对象
        //一.判断请求中有没有特殊的cookie:  JSESSIONID
        // 1有 1.根据JSESSIONID找对应的session对象: a.找到了 返回之前的session
        //                                       b.没找到 创建一个新session返回,并且向response对象中存放一个JSESSIONID的cookie


        // 2.没有 创建一个新session返回,并且向response对象中存放一个JSESSIONID的cookie
        HttpSession session = req.getSession();
        System.out.println("session.getId() = " + session.getId());
        System.out.println("session.isNew() = " + session.isNew());
        //设置session的存活时间,单位:秒,一般不用单独设置
        session.setMaxInactiveInterval(300);//5分钟

        //将username存入session
        session.setAttribute("username",name);
        session.setAttribute("id",id);

        //客户端响应信息
        resp.setContentType("text/html;charset=UTF-8");//设置text和html文件的编码格式
        resp.getWriter().write("成功");

    }
}
