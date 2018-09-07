package com.rbspring.assembleCol;

import com.rbspring.assembleCol.controller.RoleController;
import com.rbspring.assembleCol.pojo.*;
import com.rbspring.assembleCol.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by renbin on 2018/9/7.
 */
public class TestMain {
    public static void main(String[] args) {
//        testAssemeCol();
//        testAnnotion();
        testAutoWire();
    }

    public static void testAssemeCol(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("assembleColContext.xml");
        Company company1 = (Company) ctx.getBean("company1");
        System.out.println(company1.getId());
        Map<String ,String > map = company1.getMap();
        for (Map.Entry<String ,String > entry : map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        Map<Role,User> map2 = company1.getMap2();
        for (Map.Entry<Role,User> entry : map2.entrySet()){
            System.out.println(entry.getKey().getName()+","+entry.getValue().getName());
        }
    }

    /**
     * 测试注解自动扫描@Component对类对象
     * @ComponentScan 注解的类告诉哪些包下有被@Component注解的对象
     */
    public static void testAnnotion(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PojoConfig.class);
        RoleAnnotion roleAnnotion = (RoleAnnotion) ctx.getBean("role3");
//        RoleAnnotion roleAnnotion1 = ctx.getBean(RoleAnnotion.class);
        System.out.println(roleAnnotion.getName());
    }

    public static void testAutoWire(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PojoConfig.class);
//        RoleService roleService = (RoleService) ctx.getBean("roleServiceImp");
//        roleService.printRoleInfo();
        //测试歧义性 @Qualifier("roleServiceImp1"),@Primary
        RoleController roleController = (RoleController) ctx.getBean("rolecontroller1");
        roleController.print();
    }
}
