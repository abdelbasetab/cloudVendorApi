package com.login.rest;

import com.login.dto.UserDto;
import com.login.service.UserService;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;


import javax.xml.stream.events.DTD;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(UserRest.class)
class UserRestTest {


    @Autowired
    private MockMvc mvc;

    //always Spring beans  they used by Xclass that we want to test need to be mocked
    @MockBean
    private UserService userService;

    @Test
    void registerUser() throws Exception {
//        UserDto userDto = new UserDto(1L,"userFirstNameTest","userLastNameTest",
//                "userEmail@gmail.com","UserPass");
//        ResponseEntity<Object> rs =  new ResponseEntity<>("User Email is ok ", HttpStatus.OK);
//        given(this.userService.authenticateUser(userDto)).willReturn(userDto);
//
//        this.mvc.perform(post("/schedulePickup").accept(MediaType.ALL_VALUE))
//                .andExpect(status().isOk());


    }
}