package com.codestates.preproject.user.mapper;


import com.codestates.preproject.user.dto.UserDto;
import com.codestates.preproject.user.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userPostDtoToUser(UserDto.Post requestBody);

    User userPatchDtoToUser(UserDto.Patch requestBody);

    UserDto.Response userToUserResponseDto(User user);

    List<UserDto.Response> usersToUserResponseDtos(List<User> users);

}