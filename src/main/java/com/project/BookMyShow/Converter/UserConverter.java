package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.UserDto;
import com.project.BookMyShow.Model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {

    public static User DtoToEntity(UserDto userDto){
        return User.builder().name(userDto.getName()).mobNo(userDto.getMobNo()).build();
    }

    public static UserDto EntityToDto(User user){
        return UserDto.builder().name(user.getName()).mobNo(user.getMobNo()).build();
    }
}
