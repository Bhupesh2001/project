package com.moviebookingapp.project.controller;

import com.moviebookingapp.project.dto.LoginReq;
import com.moviebookingapp.project.entity.User;
import com.moviebookingapp.project.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/login")
    public ResponseEntity<User> getUsers(@RequestBody LoginReq loginReq) {
        User users = userService.findByUsernameAndPassword(loginReq.getUsername(),loginReq.getPassword());
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{username}/forgot")
    public ResponseEntity<User> forgotPassword(@PathVariable String username,
                                               @RequestHeader(value = "newPassword") String newPassword) {
        User user = userService.forgotPassword(username,newPassword);
        return ResponseEntity.ok(user);
    }
}