package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/get_user/{id}")
    public User getUser(@PathVariable ("id") int id){

    }

    @PostMapping("/add_user")
    public ResponseEntity <String> addUser(UserEntryDto userEntryDto){

    }
}
