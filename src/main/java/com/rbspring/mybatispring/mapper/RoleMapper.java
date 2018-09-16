package com.rbspring.mybatispring.mapper;
import com.rbspring.mybatispring.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
	public int insertRole(Role role);
}