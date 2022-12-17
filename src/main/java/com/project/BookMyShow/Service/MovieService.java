package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {

    public MovieResponseDto addMovie(MovieEntryDto movieDto);

    public MovieResponseDto getMovie(int id);
}
