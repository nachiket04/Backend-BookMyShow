package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate showDate;
    @Column(nullable = false)
    private LocalTime showTime;

    private Date createdAt;
    private Date updatedAt;

    @OneToMany(cascade = CascadeType.ALL)
    List <Ticket> ticketList;

    @OneToMany
    List <ShowSeat> showSeats;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Movie movie;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Theatre theatre;

}
