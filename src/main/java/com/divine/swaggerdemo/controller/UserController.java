package com.divine.swaggerdemo.controller;

import com.divine.swaggerdemo.dao.model.InputUserModel;
import com.divine.swaggerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok(userService.allUsers());
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody @Valid InputUserModel model){
        return ResponseEntity.ok(userService.createUser(model.getUsername(), model.getAge()));
    }
}
