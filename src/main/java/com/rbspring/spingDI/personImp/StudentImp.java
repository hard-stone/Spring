package com.rbspring.spingDI.personImp;

import com.rbspring.spingDI.Person;

/**
 * Created by renbin on 2018/8/6.
 */
public class StudentImp implements Person{

    String name = "rb";
    int age = 25;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void outpersonname() {
        System.out.println("my name is:"+name);
    }

    @Override
    public void outpersonage() {
        System.out.println("my age is:"+age);
    }
}
