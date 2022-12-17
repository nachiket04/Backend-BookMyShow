package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.project.BookMyShow.Model.Movie;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static Movie DtoToEntity(MovieEntryDto movieDto){
        return Movie.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }

    public static MovieResponseDto EntityToDto(Movie movie){
        return MovieResponseDto.builder().id(movie.getId()).name(movie.getName()).releaseDate(movie.getReleaseDate()).build();
    }
}
