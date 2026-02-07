package com.parkon.auth_service.Infraestructure.Controllers;


import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC; // Para el contexto si lo usas

@RestController
public class HealthController {
    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);
    @GetMapping("/health")
    public String sayHello() {
        logger.info("Health check");
        return "Auth Service is running successfully!";
    }
}