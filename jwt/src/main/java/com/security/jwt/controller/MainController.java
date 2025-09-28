package com.security.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.security.jwt.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/welcome")
    public String allAccess(){
        return "Everyone access";
    }

    @GetMapping("/user")
    public String userAccess() {
        return "User access";
    }

    @GetMapping("/special")
    public String specialAccess() {
        return "Special access with JWT";
    }

}
