package org.krish.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoRestController {

    @GetMapping("/")
    public String sayHello()
    {
        return "Spring Boot Hello world....Time is "+ LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Run a hard 5k!!!";
    }
}
