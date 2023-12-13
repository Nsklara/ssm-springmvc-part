package com.sh.param;

import com.sh.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: SH
 * @Date: 2023/12/13 16:27
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
    
    //2.注解指定
    //传递参数account page
    //要求    account必须传递,
    //       @RequestParam("account")
    //       page可以不必须传递,不传递默认值为1
    //       @RequestParam(required = false,defaultValue = "1")
    /*
    用法
    @RequestParam(value="指定请求参数名,如果形参名和请求参数名一致，可以省略！",
                required = false 前端是否必须传递此参数，默认是true必须 ， 不传报400异常
                defaultValue = "1" 当非必须传递 false ,可以设置默认值)
     */
    @RequestMapping("data1")
    @ResponseBody
    public String data1(@RequestParam("account") String username,
                        @RequestParam(required = false,defaultValue = "1") int page){//http://localhost:8080/param/data1?account=jack
        System.out.println("username = " + username + ", page = " + page);
        return "account = " + username + ", page = " + page;
    }
    
    //特殊值
    //一名多值  key=1&key=2 用集合接收
    
    //    param/data2?hbs=吃&hbs=玩&hbs=学习
    //不加注解@RequestParam 将 hbs对应的一个字符串直接赋值给集合！ 类型异常！
    //加了注解，经理就会将集合 add加入对应的字符串
    @RequestMapping("data2")
    @ResponseBody
    public String data2(@RequestParam List<String> hbs){
        System.out.println("hbs = " + hbs);
        return "ok";
    }
    
    //实体类接收     用户注册（用户的信息）    -》    对应的实体类   -》     插入到数据库 表
    //param/data3?name=jack&age=18 准备一个对应属性和get|set方法的实体类即可！ -> 形参列表声明对象参数即可！
    @RequestMapping("data3")
    @ResponseBody
    public String data3(User user){
        System.out.println("user = " + user);
        return user.toString();
    }
}
