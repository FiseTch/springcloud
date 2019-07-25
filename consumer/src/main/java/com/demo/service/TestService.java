package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tongch
 * @version 1.0
 * @time 2019/7/25 11:41
 */
@Service
public class TestService {
    
    @Autowired
    RestTemplate restTemplate;
    
    
    public String hiService(String name) {
        return restTemplate.getForObject("http://client-01/test?name=" + name, String.class);
    }
}
