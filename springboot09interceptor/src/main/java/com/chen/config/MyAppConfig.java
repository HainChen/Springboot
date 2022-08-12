package com.chen.config;

import com.chen.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyAppConfig
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/12 10:17
 * @Version 1.0
 **/
@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    //添加拦截器对象，注入到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //需要拦截的路径
        String path[] = {"/user/**"};
        //指定不拦截的地址
        String excludePath[] = {"/user/login"};

        //创建拦截器对象
        HandlerInterceptor handlerInterceptor = new LoginInterceptor();
        //注册拦截器
        registry.addInterceptor(handlerInterceptor).addPathPatterns(path).excludePathPatterns(excludePath);
    }
}
