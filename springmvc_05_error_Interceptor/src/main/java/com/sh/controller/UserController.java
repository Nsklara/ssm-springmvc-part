package com.sh.controller;

import com.sh.entity.User;
import jakarta.ws.rs.GET;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: SH
 * @Date: 2023/12/26 22:46
 */
@RestController
@RequestMapping("user")
public class UserController {
    
    @GetMapping("data1")
    public String data1() {
        //制造空指针异常   NullPointerException
        String name = null;
//        name.toString();
        System.out.println("UserController.data1");
        return "ok";
    }
    
    
    @GetMapping("data2")
    public String data2() {
        //制造算术异常
//        int i = 1 / 0;  //ArithmeticException
        
        System.out.println("UserController.data2");
        return "ok2";
    }

    //接收用户数据，校验注解
    /*
    1.实体类属性添加校验注解
    2.handler方法使用实体类接收
    3.handler方法形参列表添加@Validated注解
    tips：json参数需要额外添加 @requestBody注解
     */
    @PostMapping("/register")
    public User register(@Validated @RequestBody User user){
        System.out.println("user = " + user);
        return user;
    }

    //问题：不符合校验规则，直接抛异常
    //解决：接收错误信息，自定义返回结果
    /*捕捉错误绑定信息
    *   1. 形参列表添加BindingResult对象
    *   handler(校验对象,BindingResult result)  要求:BindingResult必须紧挨着校验对象
    *   2.BindingResult获取绑定错误
    *
    *
    * */

    @PostMapping("login")
    public Object login(@Validated @RequestBody User user, BindingResult result){

        //如果发送异常,判断体为true
        if (result.hasErrors()){
            //有绑定错误,就不直接返回,返回自定义信息
            Map data = new HashMap();
            data.put("code",400);
            data.put("msg","参数校验错误");
            return data;
        }

        System.out.println("user = " + user);
        return user;
    }


}
