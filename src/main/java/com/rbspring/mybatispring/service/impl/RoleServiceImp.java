package com.rbspring.mybatispring.service.impl;


import com.rbspring.mybatispring.mapper.RoleMapper;
import com.rbspring.mybatispring.pojo.Role;
import com.rbspring.mybatispring.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImp implements RoleService{

    @Autowired
    private RoleMapper rolemapper = null;

    Logger logger = Logger.getLogger(RoleListServiceImp.class);

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_UNCOMMITTED)
    public int insertRole(Role role) {
        return rolemapper.insertRole(role);
    }
}
