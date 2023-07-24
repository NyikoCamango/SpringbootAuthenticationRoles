package com.security.SpringSecurity.services;

import com.security.SpringSecurity.models.User;

public interface UserService {
    User findByEmail(String email);
    User findByResetToken(String resetToken);
    void save(User user);
}
