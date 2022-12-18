package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import com.project.BookMyShow.Model.Show;
import lombok.experimental.UtilityClass;


@UtilityClass
public class ShowConverter {

    public static ShowResponseDto EntityToDto(Show show){
        return ShowResponseDto.builder().id(show.getId()).showDate(show.getShowDate()).showTime(show.getShowTime()).build();
    }

    public static Show dtoToEntity(ShowEntryDto showEntryDto){
        return Show.builder().showDate(showEntryDto.getShowDate()).showTime(showEntryDto.getShowTime()).build();
    }
}
