package com.login.controller.impl;

import com.login.controller.UserRest;
import com.login.dto.UserDto;
import com.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController implements UserRest {



    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<?> authenticateUser(UserDto userDto) {

        return userService.authenticateUser(userDto);


    }

    @Override
    public ResponseEntity<?> registerUser(UserDto userDto) {

        // checklist <- todo what can hier happend ? not valid or uncompliete user dto data, handlet with custome controller exception

        //check if the request is valid <-- Todo , already did it with custome exception

            return userService.registerUser(userDto);

    }

    @Override
    public ResponseEntity<?> getAllUser() {
        return userService.getAllUser();
    }

    @Override
    public ResponseEntity<?> deleteUser(Long id) {
        return userService.deleteUser(id);
    }

    @Override
    public ResponseEntity<?> updateUser(UserDto userDto) {
        return userService.updateUser(userDto);
    }
}
