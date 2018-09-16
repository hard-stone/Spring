package com.rbspring.mybatispring;

import com.rbspring.mybatispring.mapper.RoleMapper;
import com.rbspring.mybatispring.pojo.Role;
import com.rbspring.mybatispring.service.RoleListService;
import com.rbspring.mybatispring.service.impl.RoleListServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        RoleMapper roleMapper = context.getBean(RoleMapper.class);
        Role role = new Role();
        role.setRoleName("role_name_");
        role.setNote("note_");
        roleMapper.insertRole(role);
        RoleListService roleListService = context.getBean(RoleListService.class);
        List<Role> roleList = new ArrayList<Role>();
        for (int i=1; i<=2; i++){
//            role.setId();?
            role.setRoleName("role_name_"+i);
            role.setNote("note_"+i);
            roleList.add(role);
        }
        int count = roleListService.insertRoleList(roleList);
        System.out.println(count);
    }
}
