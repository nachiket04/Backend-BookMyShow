package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreRepository extends JpaRepository <Theatre, Integer> {
}
