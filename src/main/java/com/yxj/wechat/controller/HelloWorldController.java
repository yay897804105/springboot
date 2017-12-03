package com.yxj.wechat.controller;


import com.yxj.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/hello")
    public String hello(){
        userServiceImpl.insert("yxj","yxj");
        return "Hello World YXJ";
    }
}
