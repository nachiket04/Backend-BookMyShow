package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.BookMyShow.Enum.SeatType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private double rate;
    private String seatNo;
    private SeatType seatType;
    private boolean booked;
    private Time bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Ticket ticket;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Show show;
}
