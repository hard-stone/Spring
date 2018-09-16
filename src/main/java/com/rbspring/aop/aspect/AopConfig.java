package com.rbspring.aop.aspect;

import com.rbspring.aop.pojo.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses ={com.rbspring.aop.service.impl.RoleServiceImp.class, Role.class })
public class AopConfig {

    @Bean
    public RoleAspect getRoleAspect(){
        return new RoleAspect();
    }

}
