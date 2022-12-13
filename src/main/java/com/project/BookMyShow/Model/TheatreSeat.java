package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.BookMyShow.Enum.SeatType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheatreSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String seatNo;
    @Column(nullable = false)
    private double rate;
    @Column(nullable = false)
    private SeatType seatType;


    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Theatre theatre;
}
