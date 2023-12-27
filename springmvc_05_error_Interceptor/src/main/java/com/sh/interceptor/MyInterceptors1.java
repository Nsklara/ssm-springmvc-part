package com.sh.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: SH
 * @Date: 2023/12/26 23:30
 * 复制的第二个拦截器类
 */

public class MyInterceptors1 implements HandlerInterceptor {
    
    //执行handler之前调用拦截的方法
    //设置编码格式,登录保护,权限处理等操作
    
    /* 参数解释
    request     请求对象,进行转发
    response    响应对象.进行重定向
    handler     要调用的方法对象
    return      true 放行 | false 拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器2 -- handler执行前");
        System.out.println("MyInterceptors1.preHandle");
        //拦截业务
        return true;
    }
    
    //当handler执行完毕之后触发的方法,没有拦截效果    此方法只有preHandle 返回值为true才会触发
    //对结果数据进行处理,例如敏感词汇检查
    /** 参数解释
     * @param request   请求对象
     * @param response  响应对象
     * @param handler   handler方法
     * @param modelAndView  返回的视图和共享域对象
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器2-- handler执行后");
        System.out.println("MyInterceptors1.postHandle");
    }
    
    /**
     * 整体处理完毕
     * @param request   请求对象
     * @param response  响应对象
     * @param handler   handler对象
     * @param ex        如果报错了,异常对象
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器2--整体执行完后");
        System.out.println("MyInterceptors1.afterCompletion");
    }
}
