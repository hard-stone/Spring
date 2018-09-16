package com.rbspring.mybatispring.service;

import com.rbspring.mybatispring.pojo.Role;

import java.util.List;


public interface RoleListService {
    /*调用RoleService 的insertRole方法 测试传播行为*/
    public int insertRoleList(List<Role> roleList);
}
