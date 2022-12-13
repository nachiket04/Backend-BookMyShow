package com.project.BookMyShow.Repository;

import com.project.BookMyShow.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
}
