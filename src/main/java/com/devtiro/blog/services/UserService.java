package com.devtiro.blog.services;

import java.util.UUID;

import com.devtiro.blog.domain.entities.User;

public interface UserService {
    User getUserById(UUID id);
}
