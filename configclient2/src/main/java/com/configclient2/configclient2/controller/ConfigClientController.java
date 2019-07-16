package com.configclient2.configclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangjiechen
 * @createDate 2019/7/16 15:31
 */
@RestController
public class ConfigClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return this.foo;
    }
}
