package com.chen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot08commandlinerunnerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        SpringApplication.run(Springboot08commandlinerunnerApplication.class, args);
        System.out.println("创建容器对象之后");
    }

    @Override
    public void run(String... args) throws Exception {
        //可自定义操作，如读取文件，数据库
        System.out.println("在容器对象创建好，执行的方法");
    }
}
