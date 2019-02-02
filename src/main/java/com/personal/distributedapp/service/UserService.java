package com.personal.distributedapp.service;

import com.personal.distributedapp.dto.UserDto;
import com.personal.distributedapp.entity.Users;
import com.personal.distributedapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean userExist(UserDto userDto){
        Users user = userRepository.findByUsernameAndPassword(userDto.getUsername(), userDto.getPassword());
        return user != null;
    }
}
