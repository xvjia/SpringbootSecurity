package com.lytech.xvjialing.web.controller;

import com.lytech.xvjialing.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> getUsers(){
        return null;
    }
}