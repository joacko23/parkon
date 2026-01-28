package com.parkon.auth_service.Infraestructure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String sayHello() {
        return "Auth Service is running successfully!";
    }
}