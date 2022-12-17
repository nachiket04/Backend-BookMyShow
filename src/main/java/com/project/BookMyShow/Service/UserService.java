package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public void addUser(UserEntryDto userDto);

    public UserResponseDto getUser(int id);
}
