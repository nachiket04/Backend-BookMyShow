package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.TheatreSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreSeatRepository extends JpaRepository <TheatreSeat, Integer> {
}
