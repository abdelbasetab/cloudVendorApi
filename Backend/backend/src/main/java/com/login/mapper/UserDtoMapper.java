package com.login.mapper;

import com.login.dto.UserDto;
import com.login.pojo.User;
import org.springframework.context.annotation.Bean;



public interface UserDtoMapper {

    UserDto UserToUserDto(User user);
    User userDtoToUser(UserDto userDto);

}
