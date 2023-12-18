package com.sh.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/18 14:29
 */
@Controller
@RequestMapping("header")
@ResponseBody
public class HeaderController {

    //@RequestHeader("key")注解:
    //表明该参数接收的是请求头中名为"key"的参数
    @RequestMapping("data")
    public String headerData(@RequestHeader("Host") String host,@RequestHeader("Connection") String connection) {//用host接收请求头中key为Host的参数
        System.out.println("host = " + host);
        System.out.println("connection = " + connection);
        return "host = " + host + "connection = " + connection;

    }
}
