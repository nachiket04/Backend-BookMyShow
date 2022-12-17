package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Dto.EntryDto.TheatreEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.TheatreResponseDto;
import com.project.BookMyShow.Service.Implementation.TheatreServiceImpl;
import com.project.BookMyShow.Service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("theatre")
public class TheatreController {

    @Autowired
    TheatreServiceImpl theatreService;

    @PostMapping("/add_theatre")
    public ResponseEntity<String> addTheater(@RequestBody() TheatreEntryDto theaterEntryDto){
        theatreService.addTheatre(theaterEntryDto);
        return new ResponseEntity("Theatre added successfully..!", HttpStatus.CREATED);
    }
}
