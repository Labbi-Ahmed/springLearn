package com.example.learning.Spring_framework.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    @Autowired
    public RegularCustomer regularCustomer;

    public Customer(){
//        System.out.println("Customer Initiated!");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println(" Customer post constructor call: "+ this.hashCode());
//    }
}
