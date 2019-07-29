package com.eg.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestContoller {
    @RequestMapping("/test")
    public String test(){
        return "helloword";
    }
}
