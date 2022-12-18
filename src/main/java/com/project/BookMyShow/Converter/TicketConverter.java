package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.TicketDto;
import com.project.BookMyShow.Model.Ticket;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TicketConverter {

    public static TicketDto EntityToDto(Ticket ticket){
        return TicketDto.builder().id((int)ticket.getId()).amount(ticket.getAmount()).allotedSeat(ticket.getAllotedSeat()).build();
    }
}
