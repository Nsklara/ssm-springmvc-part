package com.sh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Author: SH
 * @Date: 2023/12/13 16:24
 */
@EnableWebMvc   //给handlerAdapter配置了json转换器
                //并且添加了 RequestMappingHandlerMapping和RequestMappingHandlerAdapter
@Configuration
@ComponentScan("com.sh")
public class MvcConfig02 {
    
    
//    @Bean
//    public RequestMappingHandlerMapping handlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
//
//    @Bean
//    public RequestMappingHandlerAdapter handlerAdapter(){
//        return new RequestMappingHandlerAdapter();
//    }
}
