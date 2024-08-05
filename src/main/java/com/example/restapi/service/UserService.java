package com.example.restapi.service;

import com.example.restapi.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
