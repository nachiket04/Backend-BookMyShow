package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.project.BookMyShow.Model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public void addUser(UserEntryDto userDto);

    public UserResponseDto getUser(int id);

}
