package com.example.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String name;

    @GetMapping("/")
    public String sayHello() {
        return String.format("Hello %s", name);
    }
}
