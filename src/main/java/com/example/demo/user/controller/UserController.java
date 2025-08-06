package com.example.demo.user.controller;

import com.example.demo.user.UserDto;
import com.example.demo.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("users")
    public ResponseEntity<Object> userForm(@RequestBody UserDto.Create dto) {
        userService.save(dto);

        return ResponseEntity.ok().build();
    }
}
