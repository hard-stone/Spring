package com.rbspring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by renbin on 2018/8/6.
 */
public class TestconfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigHello.class);
        Hellojavaconfig obj = (Hellojavaconfig) context.getBean("helloword");
        obj.sayhello("hehe");
    }


}
