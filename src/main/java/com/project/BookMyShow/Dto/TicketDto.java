package com.project.BookMyShow.Dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDto {

    private int id;
    private Set <String> allotedSeat;
    private double amount;

    UserDto userDto;
    ShowDto showDto;
}
