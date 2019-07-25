package com.demo.controller;

import com.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tongch
 * @version 1.0
 * @time 2019/7/25 11:40
 */
@RestController
public class test {
    
    @Autowired
    TestService testService;
    
    @RequestMapping("/test01")
    public String test(@RequestParam String name){
        return  testService.hiService(name);
    }
}
