package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
    
    @Value("${server.port}")
    String port;
    
    
    @RequestMapping("/test")
    public String test(@RequestParam String name) {
        return "hello:->" + name + "i‘m in " + port;
    }
    
}
