package com.sh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: SH
 * @Date: 2023/12/13 1:12
 */

public class SpringMvcConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }
    
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
