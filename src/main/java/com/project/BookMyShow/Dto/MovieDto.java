package com.project.BookMyShow.Dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieDto {

    private int id;
    private String name;
    private LocalDate releaseDate;
    List <ShowDto> movies;
}
