package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.EntryDto.TheatreEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.TheatreResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface TheatreService {
    public TheatreResponseDto addTheatre(TheatreEntryDto theatreEntryDto);

    public TheatreResponseDto getTheatre(int id);
}
