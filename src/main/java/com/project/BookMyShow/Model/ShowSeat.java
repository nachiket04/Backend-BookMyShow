package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.BookMyShow.Enum.SeatType;
import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
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
