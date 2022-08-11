package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloSpringboot
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 11:24
 * @Version 1.0
 **/
@Controller
public class HelloSpringboot {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringboot(){
        return "欢迎使用spring boot框架";
    }
}
