package com.example.feignclientdemo.contoller;


import com.example.feignclientdemo.util.FeignServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignClientController {

    @Autowired
    private FeignServiceUtil serviceUtil;

    @GetMapping("/get-name")
    public String name() {
        return serviceUtil.getName();
    }

    @GetMapping("/get-status")
    public String status() {
        return serviceUtil.status();
    }

    @GetMapping("get-address")
    public String address() {
        return serviceUtil.address();
    }
}
