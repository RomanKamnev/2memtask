package com.example.memtask.service;


import com.example.memtask.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;
import java.util.List;

/**
 * UserService
 *
 * @author Kamnev Roman
 * @version 1.0
 */

public interface UserService extends UserDetailsService {

    User saveUser(User user);

    User findUserById(Long userId);

    boolean deleteUser(Long userId);

    List<User> findAllUsers();
}
