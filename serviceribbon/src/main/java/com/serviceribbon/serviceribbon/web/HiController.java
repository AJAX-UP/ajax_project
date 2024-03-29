package com.serviceribbon.serviceribbon.web;

import com.serviceribbon.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
