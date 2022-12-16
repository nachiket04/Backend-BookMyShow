package com.project.BookMyShow.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String mobNo;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List <Ticket> ticketList;
}
