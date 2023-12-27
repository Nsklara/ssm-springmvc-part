package com.sh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: SH
 * @Date: 2023/12/24 19:00
 */

public class SpringMvcInit03 extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig03.class};
    }
    
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
