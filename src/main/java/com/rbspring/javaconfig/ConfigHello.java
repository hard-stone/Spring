package com.rbspring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by renbin on 2018/8/6.
 */
@Configuration
public class ConfigHello {
    @Bean(name = "helloword")
    public Hellojavaconfig getHello(){
        return new HellojavaconfigImp();
    }
}
