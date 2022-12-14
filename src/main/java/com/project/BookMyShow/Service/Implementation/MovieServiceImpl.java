package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.MovieConverter;
import com.project.BookMyShow.Dto.MovieDto;
import com.project.BookMyShow.Model.Movie;
import com.project.BookMyShow.Repository.MovieRepository;
import com.project.BookMyShow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieDto addMovie(MovieDto movieDto) {
        Movie movie = MovieConverter.DtoToEntity(movieDto);
        movieRepository.save(movie);
        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {
        return MovieConverter.EntityToDto(movieRepository.findById(id).get());
    }
}
