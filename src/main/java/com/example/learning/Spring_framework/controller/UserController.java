package com.example.learning.Spring_framework.controller;

import com.example.learning.Spring_framework.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Scope("prototype")
public class UserController {
    @Autowired
    User user;

    public UserController(){
//        System.out.println("User controller initiated!");
    }

    @GetMapping("/test")
    public Map<String,Integer> testApi(){
        Map<String ,Integer > res = new HashMap<>();
        res.put("userController", this.hashCode());
        res.put("user", user.hashCode());
        res.put("customer",user.customer.hashCode());
        res.put("ragularCustomer", user.customer.regularCustomer.hashCode());

        return res;
    }
}
