package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellocomtroller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";

    }
}
