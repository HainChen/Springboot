package com.chen.service.impl;

import com.chen.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/12 9:39
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("你好啊："+name);
    }
}
