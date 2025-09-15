package com.fitness.userservice.service.impl;

import com.fitness.userservice.dto.UserRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.mapper.UserMapper;
import com.fitness.userservice.model.User;
import com.fitness.userservice.repository.UserRepository;
import com.fitness.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;
    @Override
    public UserResponse createUser(UserRequest request) {
        User user = mapper.toEntity(request);
        User savedUSer = userRepository.save(user);
        return mapper.toResponse(savedUSer);
    }
}
