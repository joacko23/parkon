package com.parkon.auth_service.domain.model;

public class User {
    private Long id;
    private String email;
    private String password;

    public User(String email, String password) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
        this.password = password;
    }

    // Getters
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    public void setId(Long id) { this.id = id; }
}