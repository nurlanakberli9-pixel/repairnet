package com.repairnet.service;

import com.repairnet.dto.UserDto;
import com.repairnet.entity.User;
import com.repairnet.enumm.UserRole;
import com.repairnet.mapper.UserMapper;
import com.repairnet.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private  PasswordEncoder passwordEncoder;


    @Transactional
    public void saveUserDetails(UserDto userDto) {
      User user=  userMapper.toEntity(userDto);
       Boolean existUser= userRepo.existsByEmail(user.getEmail());
       if (existUser) {
            throw new RuntimeException("bu email artiq movcuddur");
        }else
            user.setPassword(passwordEncoder.encode(user.getPassword()));
           user.setRole(UserRole.CUSTOMER);
            userRepo.save(user);
    }
}
