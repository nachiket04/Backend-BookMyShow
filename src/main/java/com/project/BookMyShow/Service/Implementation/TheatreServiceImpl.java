package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.TheatreConverter;
import com.project.BookMyShow.Dto.EntryDto.TheatreEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.TheatreResponseDto;
import com.project.BookMyShow.Enum.SeatType;
import com.project.BookMyShow.Enum.TheatreType;
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

@Service
public class TheatreServiceImpl implements TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    TheatreSeatRepository theatreSeatRepository;

    @Override
    public TheatreResponseDto addTheatre(TheatreEntryDto theatreDto) {
        Theatre theatre = TheatreConverter.DtoToEntity(theatreDto);
        theatre.setTheatreType(TheatreType.SINGLE);
        List <TheatreSeat> seats = createTheatreSeats();
        theatre.setTheatreSeats(seats);
        theatre.setShowList(null);

        for(TheatreSeat theatreSeat: seats){
            theatreSeat.setTheatre(theatre);
        }
        theatreRepository.save(theatre);
        theatreSeatRepository.saveAll(seats);
//        log.info("Successfully added");
        return TheatreConverter.EntityToDto(theatre);
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
        return seats;
    }

    public TheatreSeat getTheatreSeat(String seatNo, double rate, SeatType seatType){
        return TheatreSeat.builder().seatNo(seatNo).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheatreResponseDto getTheatre(int id) {
        return TheatreConverter.EntityToDto(theatreRepository.findById(id).get());
    }
}
