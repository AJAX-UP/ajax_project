package com.servicefeign.servicefeign.controller;

import com.servicefeign.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangjiechen
 * @createDate 2019/7/12 14:31
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.sayHiFromClientOne( name );
    }
}
