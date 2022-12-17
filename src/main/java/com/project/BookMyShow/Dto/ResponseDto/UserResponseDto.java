package com.project.BookMyShow.Dto.ResponseDto;

import lombok.*;

@Data
@Builder
public class UserResponseDto {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String mobNo;
}
