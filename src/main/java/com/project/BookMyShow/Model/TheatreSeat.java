package com.project.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.BookMyShow.Enum.SeatType;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
