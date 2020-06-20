package com.nachiappan.authorization.demo.business;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getOutput() {
        return "hello";
    }
}
