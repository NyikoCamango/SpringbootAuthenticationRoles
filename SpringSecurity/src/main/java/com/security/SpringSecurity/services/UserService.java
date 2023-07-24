package com.security.SpringSecurity.services;

import com.security.SpringSecurity.models.User;

public class UserService {
    User findByEmail(String email);
    User findByResetToken(String resetToken);
    void save(User user);
}
