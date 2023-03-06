package com.example.feignclientdemo.service;

import com.example.feignclientdemo.util.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserService {


    private FeignClientService serviceUtil;

    public UserService(FeignClientService serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    public String getName() {
        return serviceUtil.getName();
    }

    public String getAddress() {
        return serviceUtil.getAddress();
    }
    public String getStatus() {
        return serviceUtil.getStatus();
    }
}
