package com.example.memtask;

import com.example.memtask.model.User;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class TestEntities {
    public static final Long USER_ID = 1L;
    public static final User expectedUser1 = new User(USER_ID, "Username1", "password1");
    public static final User expectedUser2 = new User(USER_ID, "Username2", "password2");
    public static final List<User> entitiesList = Arrays.asList(expectedUser1, expectedUser2);
}
