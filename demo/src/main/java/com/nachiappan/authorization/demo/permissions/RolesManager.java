package com.nachiappan.authorization.demo.permissions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RolesManager {

    private Set<String> roles = new HashSet<>();

    public Set<String> getRoles() {
        return roles;
    }

    public RolesManager defineRole(String role) {
        role = role.toLowerCase();
        if(!roles.contains(role)) roles.add(role);
        return this;
    }
}

