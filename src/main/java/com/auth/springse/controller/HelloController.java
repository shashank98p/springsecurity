package com.auth.springse.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(HttpServletRequest request){
        return "Welcome to spring security"+request.getSession().getId();
    }
    @GetMapping("/profile")
    public String profile(){
        return "Welcome to spring security profile page";
    }
    @PostMapping("/addUser")
    public String addUser(){
        return "User added successfully";
    }
}
