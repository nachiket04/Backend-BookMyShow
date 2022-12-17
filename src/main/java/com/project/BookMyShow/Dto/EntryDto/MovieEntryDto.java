package com.project.BookMyShow.Dto.EntryDto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@Builder
public class MovieEntryDto {

    private String name;

    @NonNull
    private LocalDate releaseDate;

}
