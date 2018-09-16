package com.rbspring.aop.aspect;


import org.aspectj.lang.annotation.*;

/**
 * 测试@Pointcut
 */
@Aspect
public class RoleAspect1 {

    @Pointcut("execution(* com.rbspring.aop.service.impl.RoleServiceImp.printRole(..))")
    public void print(){}

    @Before("print()")
    public void before(){
        System.out.println("before............Pointcut.");
    }

    @After("print()")
    public void after(){
        System.out.println("after......Pointcut.");
    }

    @AfterReturning("print()")
    public void afterReturning(){
        System.out.println("AfterReturning......Pointcut.");
    }

    @AfterThrowing("print()")
    public void afterThrowing(){
        System.out.println("afterThrowing........Pointcut.");
    }

}
