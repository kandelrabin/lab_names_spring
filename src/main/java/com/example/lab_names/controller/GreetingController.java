package com.example.lab_names.controller;

import com.example.lab_names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public String greet(@RequestParam(defaultValue = "") String name){
        Greeting greeting = new Greeting(name, "afternoon");
        return String.format("Good %s %s!",greeting.getTimeOfDay(), greeting.getName());
    }


}
