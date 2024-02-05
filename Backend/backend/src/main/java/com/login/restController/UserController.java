package com.login.restController;

import com.login.dto.UserDto;
import com.login.pojo.User;
import com.login.rest.UserRest;
import com.login.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
