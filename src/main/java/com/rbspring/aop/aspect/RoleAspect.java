package com.rbspring.aop.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class RoleAspect {

    @Before("execution(* com.rbspring.aop.service.impl.RoleServiceImp.printRole(..))")
    public void before(){
        System.out.println("before........");
    }

    @After("execution(* com.rbspring.aop.service.impl.RoleServiceImp.printRole(..))")
    public void after(){
        System.out.println("after......Annotion.");
    }

    @AfterReturning("execution(* com.rbspring.aop.service.impl.RoleServiceImp.printRole(..))")
    public void afterReturning(){
        System.out.println("AfterReturning......Annotion.");
    }

    @AfterThrowing("execution(* com.rbspring.aop.service.impl.RoleServiceImp.printRole(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing.......Annotion..");
    }

}
