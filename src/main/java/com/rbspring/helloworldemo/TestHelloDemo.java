package com.rbspring.helloworldemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用ID定位配置文件的类
 * Created by renbin on 2018/8/6.
 */
public class TestHelloDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Helloworld helloworld = (Helloworld) context.getBean("Helloword");//或者用Helloworld.class ；为什么不能用id定位。
        helloworld.sayHello("hehe");//属性已经注入后于调用方法名称
        helloworld.sayHello();
    }
}
