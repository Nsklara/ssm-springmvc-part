package com.sh.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: SH
 * @Date: 2023/12/26 22:53
 */

//@ControllerAdvice   //可以返回视图,转发和重定向
@RestControllerAdvice   //直接返回json字符串,不返回视图
public class GlobalExceptionHandler {
    
    //发生 ArithmeticException 算术异常,走此方法
    @ExceptionHandler(ArithmeticException.class)
    public Object ArithmeticExceptionHandler(ArithmeticException e){
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }
    
    //如果发生了其他异常,没有找到注解对应的方法,可以找父异常对应的方法
    //例如发生空指针异常,就可以走Exception
    @ExceptionHandler(Exception.class)
    public Object ExceptionHandler(Exception e){
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }
}
