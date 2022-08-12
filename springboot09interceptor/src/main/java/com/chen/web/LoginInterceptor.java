package com.chen.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginInterceptor
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/12 10:12
 * @Version 1.0
 **/

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * @date 2022/8/12
     * @param [request, response, handler被拦截的控制器对象]
     * @return boolean
     **/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了LoginInterceptor类的preHandle方法");
        return true;
    }
}
