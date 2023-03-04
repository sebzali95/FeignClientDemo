package com.example.demoservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {
    @GetMapping("/name")
    public String getName() {
        return "Play Java";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "active!";
    }
    @GetMapping("/address")
    public String address() {
        return "Baku";
    }
}
