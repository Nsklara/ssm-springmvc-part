package com.sh.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/13 17:04
 */
@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {
    //路径传参,把路径当作参数
    //一般传参:   user/login?name=root&password=123456
    //路径传参:   user/root/123456
    
    //  path/账号/密码
    //  动态路径设计  {keyName1}/{keyName2}
    //  形参列表接收路径参数@PathVariable  String keyName1,@PathVariable  String keyName2 -> 接受param格式参数
    //     必须使用 @PathVariable
    //@PathVariable也可以设置
//              value="指定请求参数名,如果形参名和请求参数名一致，可以省略！",
//              required = false 前端是否必须传递此参数，默认是true必须 ， 不传报400异常
    @RequestMapping("{account}/{password}")
    public String login(@PathVariable() String account,
                        @PathVariable String password) {
        System.out.println("account = " + account + ", password = " + password);
        return "account = " + account + ", password = " + password;
    }
}
