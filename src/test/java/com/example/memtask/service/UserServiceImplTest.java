package com.example.memtask.service;

import com.example.memtask.dao.RoleDao;
import com.example.memtask.dao.UserDao;
import com.example.memtask.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static com.example.memtask.TestEntities.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @MockBean
    UserDao userDao;

    @MockBean
    RoleDao roleDao;

    @Test
    void findUserById() {
        when(userDao.findById(USER_ID)).thenReturn(java.util.Optional.of(expectedUser1));
        User actual = userService.findUserById(USER_ID);
        assertEquals(actual, expectedUser1);
    }

    @Test
    void findAllUsers() {
        when(userDao.findAll()).thenReturn(Arrays.asList(expectedUser1, expectedUser2));
        List<User> allUsers = userService.findAllUsers();
        assertEquals(allUsers, Arrays.asList(expectedUser1, expectedUser2));
    }
}