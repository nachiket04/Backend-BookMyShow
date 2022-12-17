package com.project.BookMyShow.Dto.EntryDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheatreEntryDto {

    private String name;
    private String address;
    private String city;
}
