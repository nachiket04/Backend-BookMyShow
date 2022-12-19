package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.project.BookMyShow.Model.Ticket;
import com.project.BookMyShow.Service.Implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("/get/{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable ("id") int id){
        return new ResponseEntity(userServiceImpl.getUser(id), HttpStatus.FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity <String> addUser(@RequestBody () UserEntryDto userEntryDto){
        userServiceImpl.addUser(userEntryDto);
        return new ResponseEntity("User added Successfully..!", HttpStatus.CREATED);
    }
}
