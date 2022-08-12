package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName BootController
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/12 10:26
 * @Version 1.0
 **/
@Controller
public class BootController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "访问/user/account地址";
    }


    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin(){
        return "访问/user/login地址";
    }
}
