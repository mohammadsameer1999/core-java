package com.fitness.userservice.controller;

import com.fitness.userservice.dto.UserRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/addUser")
    public ResponseEntity<UserResponse> createUser (@RequestBody UserRequest request) {
        UserResponse response = userService.createUser(request);
        System.out.println("user response is Here---------->" + response);
        return new  ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
