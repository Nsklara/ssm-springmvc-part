package com.sh.json;

import com.sh.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/13 17:27
 */
@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {
    
    //前端报错: 415 不支持的媒体类型
    //原因:   Java原生的api,只支持路径参数和param参数 request.getParameter("key"); param  不支持json
    //       json就是前端的格式
    //解决： 1. 导入json处理的依赖  2. handlerAdapter配置json转化器
    @RequestMapping("data")
    public String data(@RequestBody Person person){
        System.out.println("person = " + person);
        return person.toString();
    }
}
