package com.rbspring.assembleCol.serviceImp;

import com.rbspring.assembleCol.pojo.Role;
import com.rbspring.assembleCol.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by renbin on 2018/9/7.
 */

@Component("roleServiceImp1")
public class RoleServiceImp1 implements RoleService{

    @Autowired
    private Role role = null;

    @Override
    public void printRoleInfo() {
        System.out.println(role.getName()+","+role.getNote()+","+role.getId());
    }

    @Override
    public void printRoleInfo(Role role) {
        System.out.println(role.getName()+","+role.getNote()+","+role.getId());
    }
}
