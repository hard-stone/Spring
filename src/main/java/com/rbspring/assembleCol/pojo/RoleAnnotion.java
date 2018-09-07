package com.rbspring.assembleCol.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * Created by renbin on 2018/9/7.
 */

@Component(value = "role3")
public class RoleAnnotion {

    @Value("2")
    private int id;
    @Value("Annotion")
    private String name;
    @Value("Anotion-dev")
    private String note ;

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
