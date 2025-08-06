package com.example.demo.user.service;

import com.example.demo.user.UserDto;
import com.example.demo.user.Users;
import com.example.demo.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserDto.Create user) {

        Users saveUser = new Users(
                user.getUsername(),
                user.getName(),
                user.getPassword()
        );

        userRepository.save(saveUser);
    }
}
