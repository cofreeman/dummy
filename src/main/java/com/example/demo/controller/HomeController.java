package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HomeController {

    public String home() {
        return "Hello, World!";
    }
}
