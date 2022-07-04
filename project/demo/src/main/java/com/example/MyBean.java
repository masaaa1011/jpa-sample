package com.example;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {
    public MyBean Bean(){
        return new MyBean();
    }
}
