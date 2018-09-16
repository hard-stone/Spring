package com.rbspring.aop.service.impl;

import com.rbspring.aop.pojo.Role;
import com.rbspring.aop.service.RoleService;
import org.springframework.stereotype.Component;

@Component("roleService")
public class RoleServiceImp implements RoleService{

    @Override
    public void printRole(Role role) {
        System.out.println(role.getId()+","+role.getName()+","+role.getNote());
    }
}
