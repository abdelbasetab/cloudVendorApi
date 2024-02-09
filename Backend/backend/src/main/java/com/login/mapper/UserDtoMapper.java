package com.login.mapper;

import com.login.dto.UserDto;
import com.login.model.User;


public interface UserDtoMapper {

    UserDto UserToUserDto(User user);
    User userDtoToUser(UserDto userDto);

}
