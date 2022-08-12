package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName BootController
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 11:56
 * @Version 1.0
 **/
@Controller
public class BootController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return  "欢迎使用springboot框架";
    }
}
