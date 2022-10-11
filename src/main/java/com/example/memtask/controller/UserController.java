package com.example.memtask.controller;

import com.example.memtask.model.User;
import com.example.memtask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user_list")
    public List<User> userList() {

        return userService.findAllUsers();
    }

    @GetMapping("/get_user_by_id")
    public User getUserById(long userId) {

        return userService.findUserById(userId);
    }

    @PostMapping("/save_user")
    public User saveUser(User user) {

        return userService.saveUser(user);
    }

    @DeleteMapping("/delete_user_by_id")
    public boolean deleteUserById(long userId) {

        return userService.deleteUser(userId);
    }
}