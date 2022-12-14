package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.TheatreDto;

public interface TheatreService {
    public TheatreDto addTheatre(TheatreDto theatreDto);

    public TheatreDto getTheatre(int id);
}
