package com.project.BookMyShow.Dto;

import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import lombok.*;

@Data
@Builder
public class TicketDto {

    private int id;
    private String allotedSeat;
    private double amount;

    UserResponseDto userResponseDto;
    ShowDto showDto;
}
