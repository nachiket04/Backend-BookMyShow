package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.ShowConverter;
import com.project.BookMyShow.Dto.ShowDto;
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
    public ShowDto addShow(ShowDto showDto) {
        Show show = ShowConverter.dtoToEntity(showDto);
        Movie movie = movieRepository.findById(showDto.getMovieResponseDto().getId()).get();
        show.setMovie(movie);
        Theatre theatre = theatreRepository.findById(showDto.getTheatreResponseDto().getId()).get();
        show.setTheatre(theatre);
        List<ShowSeat> showSeats = createShowSeats(theatre.getTheatreSeats());
        show.setShowSeats(showSeats);
        showRepository.save(show);
        return showDto;
    }

    public List <ShowSeat> createShowSeats(List<TheatreSeat> theatreSeats){
        List <ShowSeat> showSeats = new ArrayList<>();
        for(TheatreSeat seat: theatreSeats){
            ShowSeat showSeat = ShowSeat.builder().seatNo(seat.getSeatNo()).seatType(seat.getSeatType()).rate(seat.getRate()).build();
            showSeats.add(showSeat);
        }
        showSeatRepository.saveAll(showSeats);
        return showSeats;
    }

    @Override
    public ShowDto getShow(int id) {
        return ShowConverter.EntityToDto(showRepository.findById(id).get());
    }
}
