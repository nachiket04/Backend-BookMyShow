package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.ShowConverter;
import com.project.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import com.project.BookMyShow.Model.*;
import com.project.BookMyShow.Repository.MovieRepository;
import com.project.BookMyShow.Repository.ShowRepository;
import com.project.BookMyShow.Repository.ShowSeatRepository;
import com.project.BookMyShow.Repository.TheatreRepository;
import com.project.BookMyShow.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    ShowSeatRepository showSeatRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    TheatreRepository theatreRepository;

    @Override
    public ShowResponseDto addShow(ShowEntryDto showEntryDto) {
        Show show = ShowConverter.dtoToEntity(showEntryDto);
        Movie movie = movieRepository.findById(showEntryDto.getMovieResponseDto().getId()).get();
        show.setMovie(movie);
        Theatre theatre = theatreRepository.findById(showEntryDto.getTheatreResponseDto().getId()).get();
        show.setTheatre(theatre);
        show = showRepository.save(show);
        List<ShowSeat> showSeats = createShowSeats(theatre.getTheatreSeats(), show);
        showSeatRepository.saveAll(showSeats);
        return ShowConverter.EntityToDto(show);
    }

    public List <ShowSeat> createShowSeats(List<TheatreSeat> theatreSeats, Show show){
        List <ShowSeat> showSeats = new ArrayList<>();
        for(TheatreSeat seat: theatreSeats) {
            ShowSeat showSeat = ShowSeat.builder().seatNo(seat.getSeatNo()).seatType(seat.getSeatType()).rate(seat.getRate()).build();
            showSeats.add(showSeat);
        }
        for(ShowSeat seat: showSeats){
            seat.setShow(show);
        }

        return showSeats;
    }

    @Override
    public ShowResponseDto getShow(int id) {
        return ShowConverter.EntityToDto(showRepository.findById(id).get());
    }
}
