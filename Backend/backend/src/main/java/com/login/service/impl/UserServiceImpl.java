package com.login.service.impl;

import com.login.dto.UserDto;
import com.login.exception.UserNotFoundException;
import com.login.mapper.UserDtoMapper;
import com.login.model.User;
import com.login.repository.UserRepository;
import com.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {



    private UserRepository userRepository;


    private UserDtoMapper userDtoMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserDtoMapper userDtoMapper){
        this.userRepository = userRepository;
        this.userDtoMapper = userDtoMapper;
    }

    @Override
    public ResponseEntity<?> authenticateUser(UserDto userDto) {

        //todo : to simple implemtation just to test samethings

        User user = userRepository.findByEmail(userDto.getEmail());
        if(user == null){
            return new ResponseEntity<>("User Email is wrong ", HttpStatus.NOT_FOUND);
        }else{
            if(user.getPassword().equals(userDto.getPassword())){
                return new ResponseEntity<>("User Email is wrong ", HttpStatus.OK);
            }else
                return new ResponseEntity<>("User password is wrong ", HttpStatus.NOT_FOUND);
        }


    }

    @Override
    public ResponseEntity<?> getUserById(Long userId) {


        if(userRepository.findById(userId) != null) {

            return new ResponseEntity<>(userRepository.findById(userId), HttpStatus.FOUND);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }



    }


    @Override
    public ResponseEntity<?> registerUser(UserDto userDto) {

        //todo : to simple implentation just to test samethings

        User user = userRepository.findByEmail(userDto.getEmail());

        if(user != null){
            return new ResponseEntity<>("User already Registerd ", HttpStatus.FOUND);
        }else{

            return new ResponseEntity<>(
                    userRepository.save(userDtoMapper.userDtoToUser(userDto)),
                    HttpStatus.CREATED);
        }

    }

    @Override
    public ResponseEntity<?> getAllUser() {

        return new ResponseEntity<>(userRepository.findAll(),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> deleteUser(Long id) {
        try{

        }catch (UserNotFoundException ex){

        }

        return new ResponseEntity<>("ID User Not Found", HttpStatus.NOT_FOUND);

    }

    @Override
    public ResponseEntity<?> updateUser(UserDto userDto){
        try{

        }catch (UserNotFoundException ex){

        }

        return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
    }

}
