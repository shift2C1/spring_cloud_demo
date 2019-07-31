package com.eg.test.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider",url = "localhost:8011")
public interface TestFeign {
    @RequestMapping("/test/test")
    public String test();
}
