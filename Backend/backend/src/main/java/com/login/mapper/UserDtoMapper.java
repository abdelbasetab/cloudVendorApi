package com.login.mapper;

import com.login.dto.UserDto;
import com.login.pojo.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserDtoMapper {

    UserDto UserToUserDto(User user);
    User userDtoToUser(UserDto userDto);

}
