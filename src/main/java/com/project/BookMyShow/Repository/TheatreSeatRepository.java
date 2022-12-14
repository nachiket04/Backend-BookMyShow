package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.Theatre;
import com.project.BookMyShow.Model.TheatreSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreSeatRepository extends JpaRepository <TheatreSeat, Integer> {
}
