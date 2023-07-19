package com.security.SpringSecurity.payload.request;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank (message = "username is required")
    private String username;

    @NotBlank(message = "username is required")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
