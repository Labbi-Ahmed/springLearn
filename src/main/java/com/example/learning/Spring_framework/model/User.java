package com.example.learning.Spring_framework.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class User {

    @Autowired
    public Customer customer;

    public User(){
        System.out.println("User initiated! every type : "+ this.hashCode());
    }


}
