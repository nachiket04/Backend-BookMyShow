package com.project.BookMyShow.Dto.EntryDto;

import com.project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.project.BookMyShow.Dto.ResponseDto.TheatreResponseDto;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowEntryDto {

    @NonNull
    private LocalDate showDate;
    @NonNull
    private LocalTime showTime;

    @NonNull
    MovieResponseDto movieResponseDto;
    @NonNull
    TheatreResponseDto theatreResponseDto;
}
