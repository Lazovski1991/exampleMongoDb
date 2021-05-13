package com.example.mongo.controller;

import com.example.mongo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        return "index";
    }


    @GetMapping("/users")
    public String getUsersPage(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }
}
