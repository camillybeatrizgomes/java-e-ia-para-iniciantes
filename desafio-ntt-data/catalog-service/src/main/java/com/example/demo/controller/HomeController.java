package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = "text/plain")
    public String home() {
        return "Bem-vindo à API Catalog-Service! 🚀";
    }
}