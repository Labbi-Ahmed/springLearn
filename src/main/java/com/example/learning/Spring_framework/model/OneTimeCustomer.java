package com.example.learning.Spring_framework.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OneTimeCustomer {
    public OneTimeCustomer() {
        System.out.println("initiated the OneTimeCustomer!");
    }
}
