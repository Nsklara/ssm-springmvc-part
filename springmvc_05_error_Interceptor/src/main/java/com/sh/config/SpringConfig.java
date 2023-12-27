package com.sh.config;

import com.sh.interceptor.MyInterceptors;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: SH
 * @Date: 2023/12/26 22:46
 */
@Configuration
@ComponentScan({"com.sh.controller","com.sh.error"})
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer {
    
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
        //将拦截器类添加到容器
        
        //配置方案1:    拦截全部请求
        registry.addInterceptor(new MyInterceptors());
    }
}
