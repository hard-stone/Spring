package com.rbspring.aop;

import com.rbspring.aop.aspect.AopConfig;
import com.rbspring.aop.pojo.Role;
import com.rbspring.aop.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    public static void main(String[] args) {
//        testAop();
        testAopAnnotion();
    }


    public static void testAop(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aopContext.xml");
        RoleService roleService = (RoleService) ctx.getBean("roleService");
        roleService.printRole((Role) ctx.getBean("role"));
    }

    public static void testAopAnnotion(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleService roleService = (RoleService) ctx.getBean("roleService");
        roleService.printRole((Role) ctx.getBean("role"));
    }
}
