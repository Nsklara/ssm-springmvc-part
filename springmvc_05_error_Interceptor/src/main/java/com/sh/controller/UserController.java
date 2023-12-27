package com.sh.controller;

import jakarta.ws.rs.GET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
}
