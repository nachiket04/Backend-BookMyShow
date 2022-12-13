package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.BookMyShow.Enum.SeatType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private double rate;
    @Column(nullable = false)
    private String seatNo;
    @Column(nullable = false)
    private SeatType seatType;
    @Column(nullable = false)
    private boolean booked;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Ticket ticket;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Show show;
}
