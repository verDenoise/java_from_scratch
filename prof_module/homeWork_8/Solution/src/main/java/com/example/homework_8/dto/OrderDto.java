package com.example.homework_8.dto;

import com.example.homework_8.model.Film;
import com.example.homework_8.model.User;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private long id;
    private User user;
    private Film film;
    private Date rentDate;
    private Integer rentPeriod;
    private boolean purchase;
}
