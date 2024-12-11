package com.example.jpaproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {

    @GetMapping("/greet")
    public String greetUser(@RequestParam String name){
        return "Hello "+ name;
    }
}
