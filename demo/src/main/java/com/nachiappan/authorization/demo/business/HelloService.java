package com.nachiappan.authorization.demo.business;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getHello() {
        return "hello";
    }

    @PreAuthorize("@accessPolicyEnforcer.isAccessible()")
    public String getWorld() {
        return "world";
    }
}
