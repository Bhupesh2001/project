package com.moviebookingapp.project.service;

import com.moviebookingapp.project.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.moviebookingapp.project.entity.User;
import com.moviebookingapp.project.repository.UserRepository;


@Service
public class UserService {

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        if(userRepository.findById(user.getLoginId()).isPresent())
            throw new CustomException("User already exits");

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUsernameAndPassword(String username,String password) {
        return userRepository.findById(username)
                .filter(user -> passwordEncoder.matches(password, user.getPassword()))
                .orElseThrow(() -> new CustomException("Invalid login credentials"));
    }

    public User forgotPassword(String username, String newPassword) {
        User user = userRepository.findById(username).orElseThrow(() -> new CustomException("Invalid Username"));
        user.setPassword(passwordEncoder.encode(newPassword));
        return userRepository.save(user);
    }
}