package com.login.restController;

import com.login.dto.UserDto;
import com.login.pojo.User;
import com.login.rest.UserRest;
import com.login.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserRest {


    @Autowired
    private UserServiceImpl userService;


    @Override
    public ResponseEntity<?> authenticateUser(UserDto userDto) {


        return userService.authenticateUser(userDto);

    }

    @Override
    public ResponseEntity<?> registerUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<?> getAllUser() {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteUser(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateUser(Long id) {
        return null;
    }
}
