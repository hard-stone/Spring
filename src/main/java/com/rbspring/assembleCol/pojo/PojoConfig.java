package com.rbspring.assembleCol.pojo;

import com.rbspring.assembleCol.controller.RoleController;
import com.rbspring.assembleCol.serviceImp.RoleServiceImp;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by renbin on 2018/9/7.
 */

//@ComponentScan(basePackages = {"com.rbspring.assembleCol.pojo","com.rbspring.assembleCol.serviceImp"})
    @ComponentScan(basePackageClasses = {RoleAnnotion.class, RoleServiceImp.class, Role.class, RoleController.class})
public class PojoConfig {
}
