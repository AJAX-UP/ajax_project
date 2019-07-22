package com.configclient2.configclient2.service;


import com.configclient2.configclient2.unitl.ConfigUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {



    public String hiService() {
        return ConfigUtils.Config.restTemplate().getForObject("http://localhost:8765/info",String.class);
    }

}
