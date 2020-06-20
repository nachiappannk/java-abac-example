package com.nachiappan.authorization.demo.business;

import org.springframework.stereotype.Component;

@Component("accessPolicyEnforcer")
public class AccessPolicyEnforcer {
    public boolean isAccessible(int input){
        if(input > 8) return true;
        return false;
    }
}
