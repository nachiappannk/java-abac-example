package com.nachiappan.authorization.demo.permissions;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Permissions {

    HashMap<String, Permission> permissionHashMap = new HashMap<>();

    public void definePermission(String permissionString, boolean defaultValue){
        if(!permissionHashMap.containsKey(permissionString))
            permissionHashMap.put(permissionString, new Permission(permissionString, defaultValue));
        else
            permissionHashMap.get(permissionString).defaultValue = defaultValue;
    }

    public boolean isPermitted(String what, List<String> roles){
        if(!permissionHashMap.containsKey(what)) return false;
        Permission p = permissionHashMap.get(what);
        return roles.stream().map(x -> p.valuesForRoles.getOrDefault(x, p.defaultValue)).anyMatch(x -> x);
    }
}

class Permission {

    public Permission(String permission, boolean defaultValue){
        this.permission = permission;
        this.defaultValue = defaultValue;
        valuesForRoles = new HashMap<>();
    }
    String permission;
    boolean defaultValue;
    HashMap<String, Boolean> valuesForRoles;
}

