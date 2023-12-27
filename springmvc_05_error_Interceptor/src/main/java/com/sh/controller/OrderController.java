package com.sh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SH
 * @Date: 2023/12/27 16:33
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("data3")
    public String data3(){
        System.out.println("OrderController.data3");
        return "ok3";
    }

    @GetMapping("data4")
    public String data4(){
        System.out.println("OrderController.data4");
        return "ok4";
    }
}
