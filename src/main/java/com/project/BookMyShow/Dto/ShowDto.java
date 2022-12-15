package com.project.BookMyShow.Dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowDto {
    private int id;
    private LocalDate showDate;
    private LocalTime showTime;

    MovieDto movieDto;
    TheatreDto theatreDto;
}
