package com.patienttracker.services;

import com.patienttracker.dto.LoginRequest;
import com.patienttracker.dto.RegisterRequest;
import com.patienttracker.model.User;
import com.patienttracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(RegisterRequest request) {
        User user = new User();
        user.setName(request.name);
        user.setEmail(request.email);
        user.setPassword(request.password);
        user.setAge(request.age);
        user.setGender(request.gender);
        user.setContact(request.contact);
        return userRepository.save(user);
    }

    public Optional<User> login(LoginRequest request) {
        return userRepository.findByEmail(request.email)
                .filter(user -> user.getPassword().equals(request.password));
    }
}
