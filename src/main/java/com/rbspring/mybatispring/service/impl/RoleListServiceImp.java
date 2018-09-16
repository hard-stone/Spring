package com.rbspring.mybatispring.service.impl;

import com.rbspring.mybatispring.pojo.Role;
import com.rbspring.mybatispring.service.RoleListService;
import com.rbspring.mybatispring.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleListServiceImp implements RoleListService {

    @Autowired
    private RoleService roleService = null;

    Logger logger = Logger.getLogger(RoleListServiceImp.class);

    @Transactional
    @Override
    public int insertRoleList(List<Role> roleList) {
        int count = 0;
        for (Role role: roleList){
            try {
                count += roleService.insertRole(role);
            }catch (Exception ex){
                logger.info(ex);
            }
        }
        return  count;
    }
}
