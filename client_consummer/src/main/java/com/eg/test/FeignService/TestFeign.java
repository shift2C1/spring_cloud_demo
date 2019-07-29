package com.eg.test.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "clientproducer")
public interface TestFeign {
    @RequestMapping("/test/test")
    public String test();
}
