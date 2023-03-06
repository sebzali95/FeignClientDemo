package com.example.feignclientdemo.contoller;


import com.example.feignclientdemo.service.UserService;
import com.example.feignclientdemo.util.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignClientController {

    @Autowired
    private UserService userService;

    @GetMapping("/name")
    public String getName() {
        return userService.getName();
    }

    @GetMapping("/status")
    public String getStatus() {
        return userService.getStatus();
    }

    @GetMapping("/address")
    public String getAddress() {
        return userService.getAddress();
    }
}
