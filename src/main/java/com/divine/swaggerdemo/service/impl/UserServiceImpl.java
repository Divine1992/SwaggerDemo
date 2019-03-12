package com.divine.swaggerdemo.service.impl;

import com.divine.swaggerdemo.dao.User;
import com.divine.swaggerdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();

    @Override
    public List<User> allUsers() {
        return this.users;
    }

    @Override
    public User createUser(String username, int age) {
        User user = new User(username, age);
        users.add(user);
        return user;
    }
}
