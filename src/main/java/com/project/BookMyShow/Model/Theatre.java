package com.project.BookMyShow.Model;

import com.project.BookMyShow.Enum.SeatType;
import com.project.BookMyShow.Enum.TheatreType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private SeatType seatType;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String city;

    TheatreType theatreType;

    @OneToMany
    List <Show> showList;

    @OneToMany
    List <TheatreSeat> theatreSeats;
}
