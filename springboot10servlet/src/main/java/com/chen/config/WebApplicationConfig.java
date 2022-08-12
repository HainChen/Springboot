package com.chen.config;

import com.chen.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

/**
 * @ClassName WebApplicationConfig
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/12 11:15
 * @Version 1.0
 **/
@Configuration
public class WebApplicationConfig {

    @Bean
    //定义方法注册servlet对象
    public ServletRegistrationBean servletRegistrationBean(){

        //访问/myservlet就是访问myservlet类
//        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login","/test"); //添加多个映射路径去访问myservelt类

        return bean;
    }
}
