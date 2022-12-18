package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.project.BookMyShow.Service.Implementation.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @GetMapping("/get/{id}")
    public ResponseEntity<MovieResponseDto> getMovie(@PathVariable ("id") int id){
        return new ResponseEntity(movieService.getMovie(id), HttpStatus.FOUND);
    }

    @PostMapping("add")
    public ResponseEntity<String> addMovie(@RequestBody () MovieEntryDto movieEntryDto){
        movieService.addMovie(movieEntryDto);
        return new ResponseEntity("Movie added Successfully..!", HttpStatus.CREATED);
    }
}
