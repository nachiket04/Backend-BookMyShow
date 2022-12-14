package com.project.BookMyShow.Dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDto {

    private String name;
    private LocalDate releaseDate;
    ShowDto showDto;
}
