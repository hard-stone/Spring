package com.rbspring.assembleCol.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by renbin on 2018/9/7.
 */
public class Company {
    private int id;
    private List<String> list;
    private Map<String,String> map;
    private Map<Role,User> map2;
    private String[] array;
    private Set set;
    private Properties props;

    private Role role = null;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Map<Role, User> getMap2() {
        return map2;
    }

    public void setMap2(Map<Role, User> map2) {
        this.map2 = map2;
    }



    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
