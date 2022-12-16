package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.UserConverter;
import com.project.BookMyShow.Dto.ResponseDto.UserDto;
import com.project.BookMyShow.Model.User;
import com.project.BookMyShow.Repository.UserRepository;
import com.project.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserDto userDto) {
        User user = UserConverter.DtoToEntity(userDto);
        userRepository.save(user);
    }

    @Override
    public UserDto getUser(int id) {
        User user = userRepository.findById(id).get();
        return UserConverter.EntityToDto(user);
    }
}
