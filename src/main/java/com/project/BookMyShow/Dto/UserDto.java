package com.project.BookMyShow.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String mobNo;
}
