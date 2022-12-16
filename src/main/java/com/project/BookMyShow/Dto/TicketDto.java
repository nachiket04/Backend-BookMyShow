package com.project.BookMyShow.Dto;

import com.project.BookMyShow.Dto.ResponseDto.UserDto;
import lombok.*;

import java.util.Set;

@Data
@Builder
public class TicketDto {

    private int id;
    private Set <String> allotedSeat;
    private double amount;

    UserDto userDto;
    ShowDto showDto;
}
