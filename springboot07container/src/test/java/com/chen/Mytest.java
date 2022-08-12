package com.chen;

import com.chen.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Mytest
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/12 9:45
 * @Version 1.0
 **/
public class Mytest {

    @Test
    public void contextLoads() {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot07containerApplication.class);
        UserService userServiceImpl = (UserService) run.getBean("userServiceImpl");
        userServiceImpl.sayHello("黑黑的回复");
    }

    @Test
    public void  test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Springboot07containerApplication.class);
        UserService userServiceImpl = (UserService) ctx.getBean("userServiceImpl");
        userServiceImpl.sayHello("打发打发");
    }
}
