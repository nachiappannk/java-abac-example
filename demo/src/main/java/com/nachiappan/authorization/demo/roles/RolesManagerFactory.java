package com.nachiappan.authorization.demo.roles;

import com.nachiappan.authorization.demo.roles.RolesManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RolesManagerFactory {
    //TODO: Have to find a way to define initialization. That gets run after the beans are registered

    public final String PATIENT_ROLE = "patient";
    public final String PROFESSIONAL_USER_L1_ROLE = "professional_l1";
    public final String ADMIN_L1_ROLE = "admin_l1";
    public final String SUPPORT_USER_L1_ROLE = "support_l1";

    @Bean
    public RolesManager rolesManager(){
        RolesManager rolesManager = new RolesManager();
        return rolesManager
                .defineRole(PATIENT_ROLE)
                .defineRole(PROFESSIONAL_USER_L1_ROLE)
                .defineRole(ADMIN_L1_ROLE)
                .defineRole(SUPPORT_USER_L1_ROLE);
    }
}
