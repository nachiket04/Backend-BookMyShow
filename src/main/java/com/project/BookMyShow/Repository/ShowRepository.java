package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository <ShowSeat, Integer> {
}
