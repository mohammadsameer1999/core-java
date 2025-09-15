package com.fitness.userservice.service;

import com.fitness.userservice.dto.UserRequest;
import com.fitness.userservice.dto.UserResponse;

public interface UserService {
    public UserResponse createUser (UserRequest request);
}
