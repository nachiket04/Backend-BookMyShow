package com.project.BookMyShow.Model;

import com.project.BookMyShow.Enum.SeatType;
import com.project.BookMyShow.Enum.TheatreType;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    private SeatType seatType;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String city;

    TheatreType theatreType;

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    List <Show> showList;

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    List <TheatreSeat> theatreSeats;
}
