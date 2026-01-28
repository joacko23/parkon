package com.parkon.auth_service.domain.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Should create user when email is valid")
    void shouldCreateUser() {
        // Arrange & Act
        User user = new User("juan@parkon.com", "securePass123");

        // Assert
        assertEquals("juan@parkon.com", user.getEmail());
        assertEquals("securePass123", user.getPassword());
    }

    @Test
    @DisplayName("Should throw exception when email is invalid")
    void shouldThrowExceptionForInvalidEmail() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new User("invalid-email", "pass");
        });
    }
}

