package com.example.mongo.controller;

import com.example.mongo.model.Users;
import com.example.mongo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class UsersRestController {
    private final UserService service;

    public UsersRestController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<Users> getUser() {
        return service.getUsers();
    }

    @GetMapping("/add")
    public void addUser() {
        service.addUser(new Users("alexander"));
    }

}
