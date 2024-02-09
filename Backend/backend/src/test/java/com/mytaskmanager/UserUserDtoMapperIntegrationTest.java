package com.mytaskmanager;

import com.login.dto.UserDto;
import com.login.mapper.UserDtoMapper;
import com.login.mapper.impl.UserDtoMapperImpl;
import com.login.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = {UserDtoMapperImpl.class})
public class UserUserDtoMapperIntegrationTest {
    @Autowired
    UserDtoMapper userDtoMapper;


    @Test
    @DisplayName("Mapped User To UserDTO")
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        User user = new User();
        user.setId(1L);
        user.setFirstName("lastname");
        user.setLastName("firstname");
        user.setEmail("email");
        user.setPassword("password");

        UserDto userDto = userDtoMapper.UserToUserDto(user);

        assertEquals(user.getId(), userDto.getId());
        assertEquals(user.getFirstName(), userDto.getFirstName());
        assertEquals(user.getLastName(), userDto.getLastName());
        assertEquals(user.getEmail(), userDto.getEmail());
        assertEquals(user.getPassword(), userDto.getPassword());

    }

    @Test
    @DisplayName("Mapped UserDTO To User")
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        UserDto userDto= new UserDto();

        userDto.setId(1l);
        userDto.setFirstName("lastname");
        userDto.setLastName("firstname");
        userDto.setEmail("email");
        userDto.setPassword("password");

        User user = userDtoMapper.userDtoToUser(userDto);
        assertEquals(userDto.getId(), user.getId());
        assertEquals(userDto.getFirstName(), user.getFirstName());
        assertEquals(userDto.getLastName(), user.getLastName());
        assertEquals(userDto.getEmail(), user.getEmail());
        assertEquals(userDto.getPassword(), user.getPassword());
    }

}

