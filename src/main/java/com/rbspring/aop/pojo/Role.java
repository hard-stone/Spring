package com.rbspring.aop.pojo;

import org.springframework.stereotype.Component;

@Component("role")
public class Role {
    private int id = 1;
    private String name = "aop-pojo";
    private String note = "dev";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
