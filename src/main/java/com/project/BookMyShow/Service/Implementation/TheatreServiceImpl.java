package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.TheatreConverter;
import com.project.BookMyShow.Dto.TheatreDto;
import com.project.BookMyShow.Enum.SeatType;
import com.project.BookMyShow.Model.Theatre;
import com.project.BookMyShow.Model.TheatreSeat;
import com.project.BookMyShow.Repository.TheatreRepository;
import com.project.BookMyShow.Repository.TheatreSeatRepository;
import com.project.BookMyShow.Service.TheatreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class TheatreServiceImpl implements TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    TheatreSeatRepository theatreSeatRepository;

    @Override
    public TheatreDto addTheatre(TheatreDto theatreDto) {

        List <Theatre> theatres = theatreRepository.findByName(theatreDto.getName());
        if(theatres.size() > 0){
            log.info("Already present");
            return new TheatreDto();
        }
        Theatre theatre = TheatreConverter.DtoToEntity(theatreDto);
        List <TheatreSeat> seats = createTheatreSeats();
        for(TheatreSeat theatreSeat: seats){
            theatreSeat.setTheatre(theatre);
        }
        theatreRepository.save(theatre);
        log.info("Successfully added");
        return theatreDto;
    }

    public List <TheatreSeat> createTheatreSeats(){
        List <TheatreSeat> seats = new ArrayList<>();
        for(int i=1; i<10; i++){
            String seatNo = "A0" + i;
            seats.add(getTheatreSeat(seatNo, 100, SeatType.CLASSIC));
        }
        for(int i=1; i<10; i++){
            String seatNo = "B0" + i;
            seats.add(getTheatreSeat(seatNo, 200, SeatType.PREMIUM));
        }
        theatreSeatRepository.saveAll(seats);
        return seats;
    }

    public TheatreSeat getTheatreSeat(String seatNo, double rate, SeatType seatType){
        return TheatreSeat.builder().seatNo(seatNo).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheatreDto getTheatre(int id) {
        return TheatreConverter.EntityToDto(theatreRepository.findById(id).get());
    }
}
