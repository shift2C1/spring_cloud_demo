package com.eg.test.contoller;

import com.eg.test.FeignService.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class TestController {
    @Autowired
//    private TestFeign testFeign;
    @RequestMapping("/getfromp")
    public String get(){
//        return testFeign.test();
        return "c";
    }
}
