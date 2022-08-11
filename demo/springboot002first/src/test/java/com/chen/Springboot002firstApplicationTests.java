package com.chen;

import com.chen.vo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class Springboot002firstApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Springboot002firstApplication.class);
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
    }

}
