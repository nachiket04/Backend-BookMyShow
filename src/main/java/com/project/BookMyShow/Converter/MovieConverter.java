package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.MovieDto;
import com.project.BookMyShow.Model.Movie;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static Movie DtoToEntity(MovieDto movieDto){
        return Movie.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }

    public static MovieDto EntityToDto(Movie movie){
        return MovieDto.builder().name(movie.getName()).releaseDate(movie.getReleaseDate()).build();
    }
}
