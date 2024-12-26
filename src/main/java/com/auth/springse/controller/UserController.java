package com.auth.springse.controller;

import com.auth.springse.model.UserRec;
//import com.auth.springse.model.Users;
import com.auth.springse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public UserRec addUser(@RequestBody UserRec user){
        return userService.addUser(user);

    }
    @PostMapping("/login")
    public String login(@RequestBody UserRec user){
        return userService.verify(user);
    }
}
