package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository <Show, Integer> {
}
