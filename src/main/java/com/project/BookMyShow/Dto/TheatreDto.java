package com.project.BookMyShow.Dto;

import lombok.*;

@Data
@Builder
public class TheatreDto {

    private int id;
    private String name;
    private String address;
    private String city;
    ShowDto showDto;
}
