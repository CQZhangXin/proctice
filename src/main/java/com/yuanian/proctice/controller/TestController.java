package com.yuanian.proctice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/TestController")
public class TestController {

    @RequestMapping(value = "/getTe")
    public  String getTe(){
        return  "这是测试微服务";
    }
}
