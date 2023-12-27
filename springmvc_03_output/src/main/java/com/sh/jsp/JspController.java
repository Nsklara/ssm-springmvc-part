package com.sh.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: SH
 * @Date: 2023/12/24 19:10
 *
 * 快速返回一个jsp页面
 */
@Controller
@RequestMapping("/jsp")
public class JspController {
    
    /*
    TODO:快速查找视图
        1.方法方法返回值是String类型
        2.不能添加@ResponseBody，添加了该注解的方法不走视图解析器，而是直接返回数据给浏览器
        3.通过返回值 返回对应视图的名称即可（要添加前后缀）
     */
    
    //跳转视图
    @GetMapping("index")
    public String indexMethod(HttpServletRequest request){
        //向request共享域中存放数据
        request.setAttribute("data","hello jsp~");
        
        System.out.println("JspController.index");
        return "indexView";
    }
    
    /* 转发:
        1.方法返回值是String类型
        2.不能添加@ResponseBody
        3.返回值添加前缀 forward:/xxx 表明转到xxx地址
     */
    
    //转发只能是项目内的资源地址
    @GetMapping("/forward")
    public String forwardMethod(){
        // 添加了forward:前缀,就不会跳转到indexView视图,而是跳转到index地址
        return "forward:/jsp/index";
    }
    
    
    /* 重定向
        1.方法返回值是String类型
        2.不能添加@ResponseBody
        3.返回值添加前缀 redirect:/重定向地址
     */
    
    //重定向(属于二次请求)
    @GetMapping("redirect")
    public String redirectMethod(){
        // 添加了redirect:前缀
        return "redirect:/jsp/index";
    }
    
    /**
     *
     *  路径细节：【不使用springmvc 使用request response】
     *     转发是项目下的资源跳转。路径： 项目下的地址  /jsp/index 忽略 applicationContext
     *     重定向项目下的资源可以是项目外的地址  重定向属于二次请求  路径： 项目下的地址 全地址 /springmvc/jsp/index  不忽略 applicationContext
     *  使用springmvc路径语法：
     *     "forward: 路径 | redirect: 路径 "  重定向，资源的地址也不需要写项目的根路径！ /jsp/index
     *     转发和重定向的地址都一样了！  /springmvc/jsp/index - >  /springmvc/springmvc/jsp/index
     */
    
    //重定向到百度
    
    @GetMapping("redirect/baidu")
    public String redirectBaidu(){
        return "redirect:https://www.baidu.com/";//访问项目外的资源不要在redirect:后加斜杠
    }
}
