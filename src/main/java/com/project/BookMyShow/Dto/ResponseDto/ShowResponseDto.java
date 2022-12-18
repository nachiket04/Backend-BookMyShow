package com.project.BookMyShow.Dto.ResponseDto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowResponseDto {
    private int id;
    private LocalDate showDate;
    private LocalTime showTime;

    MovieResponseDto movieResponseDto;
    TheatreResponseDto theatreResponseDto;
}
