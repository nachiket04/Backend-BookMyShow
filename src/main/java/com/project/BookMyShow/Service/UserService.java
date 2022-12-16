package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.ResponseDto.UserDto;

public interface UserService {

    public void addUser(UserDto userDto);

    public UserDto getUser(int id);
}
