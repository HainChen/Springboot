package com.chen.controller;

import com.chen.vo.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName BootController
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 20:31
 * @Version 1.0
 **/
@Controller
public class BootController {

    //简单属性读取注入
    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String schoolname;

    @Value("${school.address}")
    private String address;

    @Value("${school.website}")
    private String website;

    @Value("${site}")
    private String site;


    @Autowired
    @Qualifier("school")
    private School school;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData(){
        String msg = "端口："+port+"，项目访问的地址："+contextPath+",学校名称："+schoolname+",学校地址："+address+",学校网址："+website+",开放的网站："+site;
        return msg;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String querySchool(){
        return "学校信息："+school.toString();
    }
}
