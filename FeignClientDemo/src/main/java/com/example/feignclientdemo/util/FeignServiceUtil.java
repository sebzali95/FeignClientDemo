package com.example.feignclientdemo.util;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url = "http://localhost:8081/user")
public interface FeignServiceUtil {

    @GetMapping("/name")
    String getName();

    @GetMapping("/address")
    String address();

    @GetMapping("/status")
    String status();
}
