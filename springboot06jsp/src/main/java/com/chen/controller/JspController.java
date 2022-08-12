package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName JspController
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 21:14
 * @Version 1.0
 **/
@Controller
public class JspController {

//
//    @RequestMapping("")
//    public String doJsp(HttpServletRequest request){
//        request.setAttribute("data","欢迎使用jsp");
//        return "index";
//    }

@RequestMapping("/myjsp")
    public String doJsp(Model model){
        model.addAttribute("data","欢迎使用jsp");
        return "index";
    }
}
