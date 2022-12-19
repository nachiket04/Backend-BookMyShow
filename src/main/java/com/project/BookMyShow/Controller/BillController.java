package com.project.BookMyShow.Controller;

import com.project.BookMyShow.Model.Ticket;
import com.project.BookMyShow.Repository.TicketRepository;
import com.project.BookMyShow.Service.Implementation.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/get_bill/{id}")
    public ResponseEntity<String> getBill(@PathVariable ("id") int id){
        String bill = billService.getBill(id);
        return new ResponseEntity(bill, HttpStatus.CREATED);
    }
}
