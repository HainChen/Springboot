package com.chen;

import com.chen.vo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot002firstApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot002firstApplication.class, args);

    }

    @Bean("student")
    public Student createStudent(){
        Student s = new Student("猪头", 23);
        return  s;
    }

}
