package com.configclient2.configclient2.controller;

import brave.sampler.Sampler;
import com.configclient2.configclient2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author guangjiechen
 * @createDate 2019/7/16 15:31
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return this.foo;
    }

    @Autowired
    HelloService helloService;


    @RequestMapping("/miya")
    public String info(){
        return helloService.hiService();
    }



}
