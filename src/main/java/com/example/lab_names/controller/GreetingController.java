package com.example.lab_names.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public String greet(@RequestParam(defaultValue = "") String name){
        return String.format("Good afternoon %s!",name);
    }
}
