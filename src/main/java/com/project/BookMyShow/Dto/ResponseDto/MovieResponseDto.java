package com.project.BookMyShow.Dto.ResponseDto;

import com.project.BookMyShow.Dto.ShowDto;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieResponseDto {

    private int id;
    private String name;
    private LocalDate releaseDate;
    List <ShowDto> movies;
}
