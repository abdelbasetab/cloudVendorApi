package com.mytaskmanager;

import com.login.dto.UserDto;
import com.login.mapper.UserDtoMapper;
import com.login.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration("classpath:applicationContext.xml")
@SpringBootTest
public class UserUserDtoMapperIntegrationTest {
    @Autowired
    UserDtoMapper userDtoMapper;


    @Test
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

