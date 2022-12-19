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
    public TicketDto bookTicket(BookRequestDto bookRequestDto) throws Exception {
        User user = userRepository.findById(bookRequestDto.getUserId()).get();
        Show show = showRepository.findById(bookRequestDto.getShowId()).get();

        SeatType seatType = bookRequestDto.getSeatType();
        Set <String> requestedSeats = bookRequestDto.getRequestedSeats();
//        System.out.println(new ArrayList<>(requestedSeats));
        List<ShowSeat> availableSeats = show.getShowSeats();
//        System.out.println(availableSeats);

        List <ShowSeat> allotedSeats = new ArrayList<>();
        // checking if all the seats are available or not
        for(ShowSeat seat: availableSeats){
            System.out.println(seat.getSeatNo() +" "+ seat.isBooked());
            if(!seat.isBooked() && seat.getSeatType().equals(bookRequestDto.getSeatType()) && requestedSeats.contains(seat.getSeatNo())){
                allotedSeats.add(seat);
            }
        }
//        System.out.println(allotedSeats);

        if(requestedSeats.size() == allotedSeats.size()){
            Ticket ticket = Ticket.builder().user(user).show(show).showSeats(allotedSeats).build();

            double amount = 0;
            for(ShowSeat seat: allotedSeats){
                seat.setBooked(true);
                seat.setTicket(ticket);
                seat.setBookedAt(new Date());

                amount += seat.getRate();
            }
            ticket.setBookedAt(new Date());
            ticket.setAmount(amount);
            ticket.setAllotedSeat(convertListOfSeatsEntityToString(allotedSeats));

            show.getTicketList().add(ticket);
            user.getTicketList().add(ticket);

            ticket = ticketRepository.save(ticket);

            return TicketConverter.EntityToDto(ticket);
        }
        throw new Exception("Seats are not available..!");
    }
    public String convertListOfSeatsEntityToString(List<ShowSeat> bookedSeats){

        String str = "";
        for(ShowSeat showSeats : bookedSeats){

            str = str + showSeats.getSeatNo()+" ";
        }

        return str;

    }
}
