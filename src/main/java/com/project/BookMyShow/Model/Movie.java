package com.project.BookMyShow.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDate releaseDate;

    @OneToMany(mappedBy = "movie" ,cascade = CascadeType.ALL)
    List <Show> showList;
}
