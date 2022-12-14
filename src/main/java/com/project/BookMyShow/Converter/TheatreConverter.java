package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.TheatreDto;
import com.project.BookMyShow.Model.Theatre;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConverter {

    public static Theatre DtoToEntity(TheatreDto theatreDto){
        return Theatre.builder().name(theatreDto.getName()).address(theatreDto.getAddress()).city(theatreDto.getCity()).build();
    }

    public static TheatreDto EntityToDto(Theatre theatre){
        return TheatreDto.builder().name(theatre.getName()).address(theatre.getAddress()).city(theatre.getCity()).build();
    }
}
