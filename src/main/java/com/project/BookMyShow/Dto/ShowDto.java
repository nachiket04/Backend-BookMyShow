package com.project.BookMyShow.Dto;

import com.project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.project.BookMyShow.Dto.ResponseDto.TheatreResponseDto;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowDto {
    private int id;
    private LocalDate showDate;
    private LocalTime showTime;

    MovieResponseDto movieResponseDto;
    TheatreResponseDto theatreResponseDto;
}
