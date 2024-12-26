package ir.maktabsharif.hw10.service;

import ir.maktabsharif.hw10.dto.request.CreateUserRequest;
import ir.maktabsharif.hw10.dto.response.CreateUserResponse;
import ir.maktabsharif.hw10.model.User;

import java.util.Optional;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest createUserRequest);
    Optional<User> getUserByUsernameAndPassword(CreateUserRequest createUserRequest);

}
