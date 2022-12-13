package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.UserDto;
import com.project.BookMyShow.Model.User;

public interface UserService {

    public void addUser(UserDto userDto);

    public UserDto getUser(int id);
}
