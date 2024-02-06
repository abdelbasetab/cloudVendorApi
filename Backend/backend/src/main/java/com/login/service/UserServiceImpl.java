package com.login.service;

import com.login.dto.UserDto;
import com.login.exception.UserNotFoundException;
import com.login.mapper.UserDtoMapper;
import com.login.repository.UserRepository;
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
        System.out.println(userDto);

        try{

            return new ResponseEntity<>("User Found", HttpStatus.OK);

        }catch (UserNotFoundException ex){

        }

        return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);





    }

    @Override
    public ResponseEntity<?> registerUser(UserDto userDto) {

        //todo usernotfound exception custome

       // UserDtoMapper userDtoMapper = new UserDtoMapperImpl();

        return new ResponseEntity<>(userRepository.save(userDtoMapper.userDtoToUser(userDto)),
                HttpStatus.CREATED);

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
