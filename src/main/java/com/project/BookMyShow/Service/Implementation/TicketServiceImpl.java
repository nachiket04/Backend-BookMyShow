package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Converter.TicketConverter;
import com.project.BookMyShow.Dto.BookRequestDto;
import com.project.BookMyShow.Dto.TicketDto;
import com.project.BookMyShow.Enum.SeatType;
import com.project.BookMyShow.Model.Show;
import com.project.BookMyShow.Model.ShowSeat;
import com.project.BookMyShow.Model.Ticket;
import com.project.BookMyShow.Model.User;
import com.project.BookMyShow.Repository.ShowRepository;
import com.project.BookMyShow.Repository.TicketRepository;
import com.project.BookMyShow.Repository.UserRepository;
import com.project.BookMyShow.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShowRepository showRepository;

    @Override
    public TicketDto getTicket(int id) {
        return TicketConverter.EntityToDto(ticketRepository.findById(id).get());
    }

    @Override
    public TicketDto bookTicket(BookRequestDto bookRequestDto) {
        User user = userRepository.findById(bookRequestDto.getUserId()).get();
        Show show = showRepository.findById(bookRequestDto.getShowId()).get();

        SeatType seatType = bookRequestDto.getSeatType();
        Set <String> requestedSeats = bookRequestDto.getRequestedSeats();
        List<ShowSeat> availableSeats = show.getShowSeats();

        List <ShowSeat> allotedSeats = new ArrayList<>();
        // checking if all the seats are available or not
        for(ShowSeat seat: availableSeats){
            if(!seat.isBooked() && seat.getSeatType().equals(bookRequestDto.getSeatType()) && requestedSeats.contains(seat.getSeatNo())){
                allotedSeats.add(seat);
            }
        }
        if(requestedSeats.size() != allotedSeats.size()){
            throw new Error("Seats are not available");
        }

        Ticket ticket = Ticket.builder().user(user).show(show).showSeats(allotedSeats).build();

        double amount = 0;
        for(ShowSeat seat: allotedSeats){
            seat.setBooked(true);
            seat.setTicket(ticket);
            seat.setBookedAt(new Date());

            amount += seat.getRate();
        }

        ticket.setAmount(amount);
        ticket.setAllotedSeat(requestedSeats);
        ticketRepository.save(ticket);

        return TicketConverter.EntityToDto(ticket);
    }
}
