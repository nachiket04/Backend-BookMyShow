package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.ShowResponseDto;

public interface ShowService {

    public ShowResponseDto addShow(ShowEntryDto showEntryDto);

    public ShowResponseDto getShow(int id);
}
