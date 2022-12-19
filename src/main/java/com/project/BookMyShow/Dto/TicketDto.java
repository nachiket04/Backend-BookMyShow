package com.project.BookMyShow.Dto;

import com.project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.sun.istack.NotNull;
import lombok.*;

@Data
@Builder
public class TicketDto {

    private int id;
    private String allotedSeat;
    private double amount;

    UserResponseDto userResponseDto;

    ShowResponseDto showResponseDto;
}
