package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.ShowDto;

public interface ShowService {

    public ShowDto addShow(ShowDto showDto);

    public ShowDto getShow(int id);
}
