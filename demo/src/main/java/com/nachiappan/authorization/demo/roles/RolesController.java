package com.nachiappan.authorization.demo.roles;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RolesController{

    @Autowired
    RolesManager rolesManager;

    @GetMapping("/roles")
    public List<String> getRoles() {
        return new ArrayList<String>(rolesManager.getRoles());
    }

    @PostMapping("/roles")
    public void createRole(@RequestBody String role){
        rolesManager.defineRole(role);
    }
}
