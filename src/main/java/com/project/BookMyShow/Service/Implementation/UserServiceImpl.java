package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.UserConverter;
import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.project.BookMyShow.Model.Ticket;
import com.project.BookMyShow.Model.User;
import com.project.BookMyShow.Repository.TicketRepository;
import com.project.BookMyShow.Repository.UserRepository;
import com.project.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public void addUser(UserEntryDto userDto) {
        User user = UserConverter.DtoToEntity(userDto);
        userRepository.save(user);
    }

    @Override
    public UserResponseDto getUser(int id) {
        User user = userRepository.findById(id).get();
        return UserConverter.EntityToDto(user);
    }
}
