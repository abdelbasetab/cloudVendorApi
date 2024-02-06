package com.login.service;

import com.login.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

public interface UserService {




    public ResponseEntity<?> authenticateUser( UserDto userDto);


    public ResponseEntity<?> registerUser(UserDto userDto);


    //todo to test my GUI

    public ResponseEntity<?> getAllUser();


    public ResponseEntity<?> updateUser(UserDto userDto);
    public ResponseEntity<?> deleteUser(Long id);

}
