package com.patienttracker.controller;

import com.patienttracker.dto.LoginRequest;
import com.patienttracker.dto.RegisterRequest;
import com.patienttracker.model.User;
import com.patienttracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }

    @PostMapping("/login")
    public Optional<User> login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }
}
