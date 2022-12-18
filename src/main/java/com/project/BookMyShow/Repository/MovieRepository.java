package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Integer> {
    boolean existsByName(String name);
}
