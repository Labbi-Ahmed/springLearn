package com.example.learning.Spring_framework.controller;

import com.example.learning.Spring_framework.ExecutionPlan;
import com.example.learning.Spring_framework.utility.VulnerabilityScript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    ExecutionPlan  executionPlan;

    public UserController(){
       System.out.println("User controller initiated!");
    }

    @GetMapping("/scripts-execution")
    public List<Integer> testOrderExecution() {
        VulnerabilityScript script1 = new VulnerabilityScript(1, Arrays.asList(2, 3, 4));
        VulnerabilityScript script2 = new VulnerabilityScript(2, Arrays.asList());
        VulnerabilityScript script3 = new VulnerabilityScript(3, Arrays.asList());
        VulnerabilityScript script4 = new VulnerabilityScript(4, Arrays.asList(5,6));
        VulnerabilityScript script5 = new VulnerabilityScript(5, Arrays.asList());
        VulnerabilityScript script6 = new VulnerabilityScript(6, Arrays.asList());

        List<VulnerabilityScript> scripts = Arrays.asList(script1, script2, script3, script4, script5,script6 );

        // Get the execution order
        return executionPlan.getExecutionOrder(scripts);
    }
}
