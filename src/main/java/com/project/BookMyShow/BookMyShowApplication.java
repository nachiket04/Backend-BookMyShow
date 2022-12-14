package com.project.BookMyShow;

import com.project.BookMyShow.Dto.UserDto;
import com.project.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication{

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}
}
