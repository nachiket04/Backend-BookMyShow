package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.MovieDto;

public interface MovieService {

    public MovieDto addMovie(MovieDto movieDto);

    public MovieDto getMovie(int id);
}
