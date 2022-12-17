package com.project.BookMyShow.Dto.ResponseDto;

import com.project.BookMyShow.Dto.ShowDto;
import lombok.*;

@Data
@Builder
public class TheatreResponseDto {

    private int id;
    private String name;
    private String address;
    private String city;
    ShowDto showDto;
}
