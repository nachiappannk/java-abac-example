package com.nachiappan.authorization.demo.controllers;

import com.nachiappan.authorization.demo.business.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.getHello();
    }

    @GetMapping("/world")
    public String world(){
        return helloService.getWorld(6);
    }

    @GetMapping("/world-new")
    public String worldNew(){
        return helloService.getWorld(10);
    }
}
