package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Dto.TicketDto;
import com.project.BookMyShow.Model.Ticket;
import com.project.BookMyShow.Repository.TicketRepository;
import com.project.BookMyShow.Service.Implementation.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping("/get_bill/{id}")
    public ResponseEntity<String> getBill(@PathVariable ("id") int id){
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
        return new ResponseEntity(bill, HttpStatus.CREATED);
    }
}
