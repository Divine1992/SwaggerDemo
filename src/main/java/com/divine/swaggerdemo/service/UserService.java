package com.divine.swaggerdemo.service;

import com.divine.swaggerdemo.dao.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    User createUser(String username, int age);
}
