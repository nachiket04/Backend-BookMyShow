package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository <Theatre, Integer> {
}
