package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.EntryDto.TheatreEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.TheatreResponseDto;
import com.project.BookMyShow.Model.Theatre;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConverter {

    public static Theatre DtoToEntity(TheatreEntryDto theatreDto){
        return Theatre.builder().name(theatreDto.getName()).address(theatreDto.getAddress()).city(theatreDto.getCity()).build();
    }

    public static TheatreResponseDto EntityToDto(Theatre theatre){
        return TheatreResponseDto.builder().id(theatre.getId()).name(theatre.getName()).address(theatre.getAddress()).city(theatre.getCity()).build();
    }
}
