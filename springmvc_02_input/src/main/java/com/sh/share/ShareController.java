package com.sh.share;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/18 18:00
 */
@Controller
@RequestMapping("share")
@ResponseBody
public class ShareController {

    //如何获取共享域？
    //1.原生api获取
    //全局
    private ServletContext servletContext;

    public void data1(HttpServletRequest request, HttpSession session){
        //对共享域的操作
        request.setAttribute("key1","value1");
        session.setAttribute("session1","value2");

        //getAttribute....
    }

    //springMVC提供的方法(了解)



}
