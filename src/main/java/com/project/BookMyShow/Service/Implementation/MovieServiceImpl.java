package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.MovieConverter;
import com.project.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
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
    public MovieResponseDto addMovie(MovieEntryDto movieDto) {
        Movie movie = MovieConverter.DtoToEntity(movieDto);
        if(movieRepository.existsByName(movie.getName())){
            throw new Error("Movie Already Present");
        }
        movieRepository.save(movie);
        return MovieConverter.EntityToDto(movie);
    }

    @Override
    public MovieResponseDto getMovie(int id) {
        return MovieConverter.EntityToDto(movieRepository.findById(id).get());
    }
}
