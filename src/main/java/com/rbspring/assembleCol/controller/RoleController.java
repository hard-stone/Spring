package com.rbspring.assembleCol.controller;

import com.rbspring.assembleCol.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by renbin on 2018/9/7.
 */
@Component("rolecontroller1")
public class RoleController {

    @Autowired
    @Qualifier("roleServiceImp1")
    RoleService roleService = null;

    public void print(){
        roleService.printRoleInfo();
    }
}
