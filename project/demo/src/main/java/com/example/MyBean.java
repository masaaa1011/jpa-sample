package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {
    public MyBean Bean(){
        return new MyBean();
    }
    
    @Bean
    public String BeanMethod(){
        return "from bean method";
    }
}
