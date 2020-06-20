package com.nachiappan.authorization.demo.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    Logger logger = LoggerFactory.getLogger(HelloService.class);


    public String getHello() {
        return "hello";
    }

    @PreAuthorize("@accessPolicyEnforcer.isAccessible(#input)")
    public String getWorld(int input) {
        return "world"+input;
    }
}
