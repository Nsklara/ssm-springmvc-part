package com.sh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: SH
 * @Date: 2023/12/24 18:59
 */

@Configuration
@ComponentScan("com.sh.json")
@EnableWebMvc   //添加了json解析器,同时自动添加了HandlerMapping和HandlerAdapter

//WebMvcConfigurer springMvc进行组件配置的规范,配置组件,提供各种方法!
public class MvcConfig03 implements WebMvcConfigurer {
    
    //添加视图解析器
    //springmvc提供了接口WebMvcConfigurer,我们只需要重写需要配置的部分就行
    //不再需要@Bean方法添加进容器
    //这里需要添加视图解析器,因此重写configureViewResolvers
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //registry可以快速添加前后缀
        registry.jsp("/WEB-INF/views/",".jsp");
        
        //如此配置以后,handler在查找视图 index 会自动的添加前后缀,如下所示
        ///WEB-INFO/views/index.jsp
    }
    
    //开启静态资源查找
    //让dispatcherServlet在handlerMapping中查找有没有对应的handler,如果没有,再查找静态资源
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
