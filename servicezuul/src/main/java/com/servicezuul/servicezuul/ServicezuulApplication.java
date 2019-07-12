package com.servicezuul.servicezuul;


@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ServicezuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicezuulApplication.class, args);
    }

}
