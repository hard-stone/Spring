package com.rbspring.testService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class roleServiceImp implements roleService{

    @Override
    public void printrole(Role role) {
        System.out.println(role.getId()+","+role.getNote());
    }
}
