package com.sh.api;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/18 14:46
 */
@RequestMapping("api")
@ResponseBody
@Controller
public class ApiController {

    //全局声明ServletContext
    //ioc容器获取对应的实体类对象(组件)并自动装配
    @Autowired
    private ServletContext servletContext;

    //原生api调用
    public void ApiData(HttpServletRequest req,
                        HttpServletResponse resp,
                        HttpSession session){

        //直接使用原生对象就可以


        //特殊:
        //ServletContext
        //1.读取全局配置文件
        //2.全局最大共享域,get/setAttribute
        //3.拥有核心api getRealPath

        //1.通过request,session获取
        ServletContext servletContext = req.getServletContext();
        ServletContext servletContext1 = session.getServletContext();

        //2.全局声明servletContext对象
        //程序启动时 servletContext会自动装入到ioc容器

    }
}
