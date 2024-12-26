package ir.maktabsharif.hw10.service;

import ir.maktabsharif.hw10.dto.request.CreateUserRequest;
import ir.maktabsharif.hw10.dto.response.CreateUserResponse;
import ir.maktabsharif.hw10.model.User;
import ir.maktabsharif.hw10.repository.UserRepository;
import ir.maktabsharif.hw10.repository.UserRepositoryImpl;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepositoryImpl();


    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {

        User user = User.builder().userName(createUserRequest.getUserName()).password(createUserRequest.getPassword()).build();

        if(checkUniqueUserName(createUserRequest.getUserName())){
            userRepository.save(user);
            return CreateUserResponse.builder().id(user.getId()).userName(user.getUserName()).password(user.getPassword()).build();
        }

        return null;

    }

    public boolean checkUniqueUserName(String userName) {
        List<User> list = userRepository.findByUsername(userName);
        if(list.isEmpty()){

            return true;
        }
        return false;
    }
    @Override
    public Optional<User> getUserByUsernameAndPassword(CreateUserRequest createUserRequest) {
        return userRepository.findByUsernameAndPassword(createUserRequest.getUserName(), createUserRequest.getPassword());

    }



}
