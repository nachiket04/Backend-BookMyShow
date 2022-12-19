package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.BookRequestDto;
import com.project.BookMyShow.Dto.TicketDto;

public interface TicketService {

    public TicketDto getTicket(int id);

    public TicketDto bookTicket(BookRequestDto bookRequestDto) throws Exception;
}
