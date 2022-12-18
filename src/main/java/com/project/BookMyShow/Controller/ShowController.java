package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import com.project.BookMyShow.Service.Implementation.ShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("show")
public class ShowController {

    @Autowired
    ShowServiceImpl showService;

    @PostMapping("/add")
    public ResponseEntity<String> addShow(@RequestBody () ShowEntryDto showEntryDto){
        showService.addShow(showEntryDto);
        return new ResponseEntity("Show added Successfully..!", HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ShowResponseDto> getShow(@PathVariable ("id") int id){
        return new ResponseEntity(showService.getShow(id), HttpStatus.FOUND);
    }
}
