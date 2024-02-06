package com.login.mapper;

import com.login.dto.UserDto;
import com.login.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapperImpl implements UserDtoMapper {

    @Override
    public UserDto UserToUserDto(User user) {
        if (user == null) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());

        return userDto;
    }

    @Override
    public User userDtoToUser(UserDto userDto) {
        if (userDto == null) {
            return null;
        }

        User user = new User();

        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());

        return user;
    }
}

