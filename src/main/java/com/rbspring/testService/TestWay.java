package com.rbspring.testService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestWay {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        roleService roleService = ctx.getBean(com.rbspring.testService.roleService.class);
        Role role = new Role();
        roleService.printrole(role);
    }
}
