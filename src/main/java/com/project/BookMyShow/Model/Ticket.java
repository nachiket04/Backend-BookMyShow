package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String allotedSeat;
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
