package com.fitness.userservice.mapper;

import com.fitness.userservice.dto.UserRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") // Spring Boot se integrate karega
public interface UserMapper {

    // DTO → Entity
    User toEntity(UserRequest dto);

    // Entity → DTO
    @Mapping(source = "role", target = "role")
    UserResponse toResponse(User user);
}
