package com.sh.json;

import com.sh.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: SH
 * @Date: 2023/12/24 19:46
 */
//@Controller
//@ResponseBody //返回json数据的注解,可以写在类和方法上
@RequestMapping("/json")

@RestController //等同于@Controller + @ResponseBody
public class JsonController {
    
    //返回一个对象
    @GetMapping("/data")
    @ResponseBody
    public User data(){
        User user = new User("jack",19);
        return user;    //user对象在handlerAdapter中转成json字符串
                        //添加一个responseBody注解,json数据直接返回给浏览器
    }
    
    //如果要接收json数据,用post方式访问
    //返回一个对象数组
    @GetMapping("/datalist")
    @ResponseBody
    public List<User> dataList(){
        User user = new User("tom", 10);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
    
    
}
