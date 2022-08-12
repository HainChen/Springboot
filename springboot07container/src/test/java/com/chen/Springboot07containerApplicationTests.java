package com.chen;

import com.chen.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class Springboot07containerApplicationTests {

    @Test
    void contextLoads() {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot07containerApplication.class);
        UserService userServiceImpl = (UserService) run.getBean("userServiceImpl");
        userServiceImpl.sayHello("黑黑的回复");
    }

}
