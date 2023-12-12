package com.sh.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/13 0:40
 */
//@Controller
//@RequestMapping("user")
public class UserController {
    
    /**
    TODO:
        @WebServlet(" 必须使用 / 开头")   /user/login
        -
        @RequestMapping( " 不必要使用 / 开头") user/login 或 /user/login
        1. 地址的编写方式
            1.精准地址[一个 或 多个] 一个: "user/login"    多个: {"user/login","user/index"}
            2.模糊地址 * 代表任意一层字符串  **代表任一层字符串      一般不设置模糊值
            *  /user/* 代表 user/a user/b user/c ... 都可以匹配   /user/a/b 不行
            **    /user/** 代表 user/a/b user/a/c user/a 都可以匹配
     
        2. @RequestMapping也可以写在类上,表示提取前缀
        例如本类将/user提取出来,本类的其他方法的注解就不用以/user开头
        访问时 类地址 + 方法地址即可
        3. 请求方式指定(get,post,put,delete)
        默认情况下,任意请求方式都可以访问
        添加  method = RequestMethod.枚举类型
             多个 method = {请求方式1,请求方式2}
        如果不符合请求方式: 会出现405异常
        4. 注解进阶     只能用在方法上!
        get     @GetMapping("地址")     == @RequestMapping("地址",method=GET);
        post    @PostMapping("地址")    == @RequestMapping("地址",method=POST);
        put     @PUTMapping("地址")     == @RequestMapping("地址",method=PUT);
        delete  @DeleteMapping("地址")  == @RequestMapping("地址",method=DELETE);
        
     */
    
    
    @RequestMapping(value = "/login" /*,method = RequestMethod.POST*/)// 作用: 注册地址,将handler注册到handlerMapping
    @ResponseBody
    public String login(){
        System.out.println("UserController.login");
        return "login";
    }
    
    @RequestMapping(value = "/register",method = {RequestMethod.GET,RequestMethod.POST})
    public String register(){
         return "register";
    }
}
