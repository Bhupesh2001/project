package com.moviebookingapp.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingapp.project.entity.User;
import com.moviebookingapp.project.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String loginId) {
        return userRepository.findById(loginId);
    }

    public User updateUser(String loginId, User userDetails) {
        User user = userRepository.findById(loginId).orElseThrow(() -> new RuntimeException("User not found"));
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setPassword(userDetails.getPassword());
        user.setContactNumber(userDetails.getContactNumber());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    public void deleteUser(String loginId) {
        userRepository.deleteById(loginId);
    }
}