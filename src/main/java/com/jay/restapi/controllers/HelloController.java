package com.jay.restapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String greetByHello()
    {
        return "Hello, welcome to Schwab";
    }
}
