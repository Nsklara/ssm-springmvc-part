package com.sh.input_01.param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/13 1:27
 */
@Controller
@RequestMapping("param")
public class ParamController {
    
    //直接接收
    //形参列表填写对应的参数名      请求参数名 = 形参参数名
    //问题: 1.请求参数和形参参数命名必须相同
    //     2.可以不传递参数,也不报错,在程序中可能还要判断是否为空
    @RequestMapping("data")
    @ResponseBody
    public String data(String name,int age){
        System.out.println("name = " + name + ", age = " + age);
        return "name = " + name + ", age = " + age;
    }
    
}
