package com.anon.techhub.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControllers {
    @GetMapping("/list")
    public String getAllUsers(){
        return "This is the list of all users";
    }
}
