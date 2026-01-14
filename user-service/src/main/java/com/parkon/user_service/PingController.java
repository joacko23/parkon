package com.parkon.user_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "user-service OK";
    }
}
