package com.login.service;

import com.login.mapper.UserDtoMapper;
import com.login.mapper.impl.UserDtoMapperImpl;
import com.login.model.User;
import com.login.repository.UserRepository;
import com.login.service.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

class UserServiceImplTest {


    //always Spring beans hier need to be mocked
    private final UserRepository userRepository = mock(UserRepository.class);;

    private static UserDtoMapper userDtoMapper;
    private UserService userService;

    @BeforeAll
    static void setUserDtoMapper(){
        userDtoMapper = new UserDtoMapperImpl();
    }

    @BeforeEach
    void setUp() {


        userService = new UserServiceImpl(userRepository,userDtoMapper);

    }

    @Test
    @DisplayName("Test find User by ID ,expected User Found > ")
    void userFindByIdWithUserFound() {

        when(userRepository.findById(1L)).thenReturn(Optional.of(new User(1L, "John","Doe" ,"pass","john@example.com")));


        ResponseEntity responseEntity = userService.getUserById(1L);



        assertEquals( Optional.of(new User(1L, "John","Doe" ,"pass","john@example.com")), responseEntity.getBody());

    }
    @Test
    @DisplayName("Test find User by ID ,expected User Not Found > ")
    void userFindByIdWithUserNotFound() {

        when(userRepository.findById(1L)).thenReturn(Optional.of(new User(1L, "John","Doe" ,"pass","john@example.com")));


        ResponseEntity responseEntity = userService.getUserById(2L);



        assertEquals(Optional.empty(), responseEntity.getBody());

    }

    @Test
    @DisplayName("Test Register User ")
    void registerUser() {

    }

    @Test
    @DisplayName("Test Register User ")
    void getAllUser() {


    }
}