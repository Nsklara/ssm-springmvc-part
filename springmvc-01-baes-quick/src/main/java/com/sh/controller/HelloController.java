package com.sh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/12 23:15]
 *
 */
@Controller
public class HelloController {
    
    //定义handler
    @RequestMapping("springmvc/hello")//对外访问地址  也是此方法注册到HandlerMapping的注解
    @ResponseBody   //表示直接返回字符串给前端,不需要视图解析器(不跳转其他页面)
    public String hello(){
        System.out.println("HelloController.hello");
        return "springmvc!!";
    }
}
