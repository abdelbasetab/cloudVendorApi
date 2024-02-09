package com.login.rest;

import com.login.controller.UserRest;
import com.login.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


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