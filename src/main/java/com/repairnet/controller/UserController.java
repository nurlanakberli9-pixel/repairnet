package com.repairnet.controller;

import com.repairnet.dto.UserDto;
import com.repairnet.entity.User;
import com.repairnet.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void saveUser(@Valid @RequestBody UserDto userDto) {
        userService.saveUserDetails(userDto);
    }
}
