package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.project.BookMyShow.Model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {

    public static User DtoToEntity(UserEntryDto userDto){
        return User.builder().name(userDto.getName()).mobNo(userDto.getMobNo()).build();
    }

    public static UserResponseDto EntityToDto(User user){
        return UserResponseDto.builder().id(user.getId()).name(user.getName()).mobNo(user.getMobNo()).build();
    }
}
