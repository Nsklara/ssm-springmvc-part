package com.sh.config;

import com.sh.interceptor.MyInterceptors;
import com.sh.interceptor.MyInterceptors1;
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
//        registry.addInterceptor(new MyInterceptors());

        //配置方案2:    指定地址拦截
//        registry.addInterceptor(new MyInterceptors())
//                .addPathPatterns("user/data1"); //只拦截/user/data1路径
//                支持模糊拦截 *任意一层 **任意多层
//                .addPathPatterns("/user/**");    //拦截user/路径下的所有路径

        //配置方案3:    排除拦截
//        registry.addInterceptor(new MyInterceptors())
//                .addPathPatterns("/user/**").excludePathPatterns("/user/data1");    //拦截/user路径下的所有路径，除了/user/data1

        //多个拦截器的优先级：
        //先声明的优先级高，优先级高的在外层，类似于aop思想的切面
        registry.addInterceptor(new MyInterceptors());
        registry.addInterceptor(new MyInterceptors1());
    }
}
