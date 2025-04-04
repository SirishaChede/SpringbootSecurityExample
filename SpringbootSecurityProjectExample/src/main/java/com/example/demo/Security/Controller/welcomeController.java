package com.example.demo.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    // Accessible by both USER and ADMIN
    @GetMapping("/contact")
    public String contact() {
        return "653564674";
    }

    // Accessible by ADMIN only
    @GetMapping("/get")
    public String greeting() {
        return "Welcome ";
    }

    // Public endpoint (no authentication required)
    @GetMapping("/greet")
    public String wish(){
        return "goodmorning";
    }
}

