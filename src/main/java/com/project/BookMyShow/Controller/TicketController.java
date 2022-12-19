package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Dto.BookRequestDto;
import com.project.BookMyShow.Dto.TicketDto;
import com.project.BookMyShow.Model.Ticket;
import com.project.BookMyShow.Service.Implementation.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("/get/{id}")
    public ResponseEntity<TicketDto> getTicket(@PathVariable ("id") int id){
        return new ResponseEntity(ticketService.getTicket(id), HttpStatus.FOUND);
    }

    @PostMapping("/book")
    public ResponseEntity<String> bookTicket(@RequestBody () BookRequestDto bookRequestDto) throws Exception {
        ticketService.bookTicket(bookRequestDto);
        return new ResponseEntity("Ticket Booked Successfully..!", HttpStatus.CREATED);
    }
}
