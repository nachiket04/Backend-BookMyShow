package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.ShowDto;
import com.project.BookMyShow.Model.Show;
import lombok.experimental.UtilityClass;


@UtilityClass
public class ShowConverter {

    public static ShowDto EntityToDto(Show show){
        return ShowDto.builder().showDate(show.getShowDate()).showTime(show.getShowTime()).build();
    }

    public static Show dtoToEntity(ShowDto showDto){
        return Show.builder().showDate(showDto.getShowDate()).showTime(showDto.getShowTime()).build();
    }
}
