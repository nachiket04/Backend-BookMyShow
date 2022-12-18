package com.project.BookMyShow.Dto.ResponseDto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieResponseDto {

    private int id;
    private String name;
    private LocalDate releaseDate;
    List <ShowResponseDto> movies;
}
