package com.projects.ecommerce_platform.controller;


import com.projects.ecommerce_platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;




@org.springframework.stereotype.Controller
public class Controller {

    private final UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homePage() {

        return "homepage";
    }

}
