package com.project.BookMyShow.Model;

import com.project.BookMyShow.Enum.SeatType;
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

    private String name;
    private SeatType seatType;
    private String address;
    private String city;


    @OneToMany
    List <Show> showList;

    @OneToMany
    List <TheatreSeat> theatreSeats;
}
