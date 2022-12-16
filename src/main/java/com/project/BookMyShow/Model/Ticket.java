package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Builder
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Set<String> allotedSeat;
    @Column(nullable = false)
    private double amount;
    @CreatedDate
    @Column(nullable = false)
    private Date bookedAt;

    @OneToMany
    List <ShowSeat> showSeats;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    User user;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Show show;

}
