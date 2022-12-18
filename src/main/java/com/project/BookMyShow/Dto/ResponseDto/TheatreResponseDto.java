package com.project.BookMyShow.Dto.ResponseDto;

import lombok.*;

@Data
@Builder
public class TheatreResponseDto {

    private int id;
    private String name;
    private String address;
    private String city;


    ShowResponseDto showResponseDto;
}
