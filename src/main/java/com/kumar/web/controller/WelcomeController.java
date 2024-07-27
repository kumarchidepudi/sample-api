package com.kumar.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {


    @GetMapping("/hello")
    public String welcome() {
        return "Hello I'm from the controller";
    }

}