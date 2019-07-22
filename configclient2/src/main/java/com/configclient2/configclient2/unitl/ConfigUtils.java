package com.configclient2.configclient2.unitl;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author guangjiechen
 * @createDate 2019/7/22 10:33
 */
public class ConfigUtils {
    @Configuration
    public static   class Config {

        @Bean
        @LoadBalanced
        public static RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }
}
