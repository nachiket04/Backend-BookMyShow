package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
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

    private Date showDate;
    private Time showTime;
    private Time createdAt;
    private Time updatedAt;

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
