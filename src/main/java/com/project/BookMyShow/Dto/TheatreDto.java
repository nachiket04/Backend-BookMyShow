package com.project.BookMyShow.Dto;

import com.project.BookMyShow.Model.TheatreSeat;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheatreDto {

    private String name;
    private String address;
    private String city;
}
