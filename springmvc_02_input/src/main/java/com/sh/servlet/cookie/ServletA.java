package com.sh.servlet.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/**
 * @Author: SH
 * @Date: 2023/12/13 20:20
 */
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建cookie
        Cookie cookie = new Cookie("cookie1","value1");
        Cookie cookie2 = new Cookie("cookie2","value2");

        //设置cookie的持久化时间,单位:秒
        cookie.setMaxAge(300);

        //设置cookie的提交路径,只有访问设置的路径下的资源才会携带该cookie
        cookie.setPath("/servletB");

        //将cookie放入response
        resp.addCookie(cookie);
        resp.addCookie(cookie2);

    }
}
