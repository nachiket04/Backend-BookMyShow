package com.project.BookMyShow.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String mobNo;
}
