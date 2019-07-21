package com.configclient2.configclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class Configclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Configclient2Application.class, args);
    }

}
