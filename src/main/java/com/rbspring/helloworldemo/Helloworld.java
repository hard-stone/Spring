package com.rbspring.helloworldemo;

/**
 * Created by renbin on 2018/8/6.
 */
public class Helloworld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("say name:"+name);
    }

    public void sayHello(String  name){
        System.out.println("say name:"+name);
    }
}
