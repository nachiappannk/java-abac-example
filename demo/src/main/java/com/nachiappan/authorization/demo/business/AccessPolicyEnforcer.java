package com.nachiappan.authorization.demo.business;

import org.springframework.stereotype.Component;

@Component("accessPolicyEnforcer")
public class AccessPolicyEnforcer {
    public boolean isAccessible(){
        return false;
    }
}
