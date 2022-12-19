package com.project.BookMyShow.Dto;

import com.project.BookMyShow.Enum.SeatType;
import lombok.*;

import java.util.Set;

@Data
@Builder
public class BookRequestDto {

    @NonNull
    private int userId;
    @NonNull
    private int showId;

    Set<String> requestedSeats;
    private SeatType seatType;
}
