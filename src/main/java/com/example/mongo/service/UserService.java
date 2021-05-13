package com.example.mongo.service;

import com.example.mongo.model.Users;
import com.example.mongo.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<Users> getUsers() {
        return userRepo.findAll();
    }

    public void addUser(Users users) {
        userRepo.insert(users);
    }
}
