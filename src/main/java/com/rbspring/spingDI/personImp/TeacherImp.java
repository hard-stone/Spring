package com.rbspring.spingDI.personImp;

import com.rbspring.spingDI.Person;

/**
 * Created by renbin on 2018/8/6.
 */
public class TeacherImp implements Person{

    String name ;
    int age;
    String heheda;

    public TeacherImp(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public TeacherImp(int age,String name,String heheda) {
        this.age = age;
        this.heheda = heheda;
        this.name = name;
    }

    @Override
    public void outpersonname() {
        System.out.println("my name:"+name);
    }

    @Override
    public void outpersonage() {
        System.out.println("my age:"+age);
    }
}
