package com.chen;

import com.chen.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot07containerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot07containerApplication.class, args);
        UserService userService = (UserService) run.getBean("userServiceImpl");
        userService.sayHello("猪头");
    }

}
