package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository <Ticket, Integer> {
}
