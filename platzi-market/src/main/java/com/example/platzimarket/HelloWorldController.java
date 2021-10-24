package com.example.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HelloWorldController {

    @GetMapping("/")
    public String message() {
        return "Hello world";
    }
}
