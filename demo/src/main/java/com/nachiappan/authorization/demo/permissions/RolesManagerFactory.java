package com.nachiappan.authorization.demo.permissions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class RolesManagerFactory {

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
