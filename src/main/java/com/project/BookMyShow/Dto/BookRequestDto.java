package com.project.BookMyShow.Dto;

import com.project.BookMyShow.Enum.SeatType;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequestDto {

    private int userId;
    private int showId;
    Set<String> requestedSeats;
    private SeatType seatType;
}
