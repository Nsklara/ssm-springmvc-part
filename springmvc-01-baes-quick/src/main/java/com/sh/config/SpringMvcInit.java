package com.sh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: SH
 * @Date: 2023/12/12 23:26
 */
public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    //创建service mapper层的ioc容器的配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    
    //设置项目的配置类,创建springmvc controller的ioc容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }
    
    // 配置springmvc内置servlet的访问地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
