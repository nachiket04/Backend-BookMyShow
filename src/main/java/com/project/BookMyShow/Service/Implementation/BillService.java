package com.project.BookMyShow.Service.Implementation;

import com.project.BookMyShow.Model.Ticket;
import com.project.BookMyShow.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Autowired
    TicketRepository ticketRepository;

    public String getBill(int id){
        StringBuilder bill = new StringBuilder();
        Ticket ticket = ticketRepository.findById(id).get();
        bill.append("Name: " + ticket.getUser().getName());
        bill.append("\n");
        bill.append("Mobile: " + ticket.getUser().getMobNo());
        bill.append("\n");
        bill.append("Booked At: " + ticket.getBookedAt());
        bill.append("\n");
        bill.append("Show Date: " + ticket.getShow().getShowDate());
        bill.append("\n");
        bill.append("Show Time: " + ticket.getShow().getShowTime());
        bill.append("\n");
        bill.append("Movie Name: " + ticket.getShow().getMovie().getName());
        bill.append("\n");
        bill.append("Seats: " + ticket.getAllotedSeat());
        bill.append("\n");
        bill.append("\n");
        bill.append("Bill Amount: " + ticket.getAmount());
        bill.append("\n");
        return bill.toString();
    }
}
