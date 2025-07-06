package com.ecommerce.application.userservice.api.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "hello from user";
    }
}
