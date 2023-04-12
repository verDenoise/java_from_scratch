package com.example.homework_9.dto;

import lombok.Data;

@Data
public class RentFilmDto{
    Long filmId;
    Long userId;
    Integer amount;
    Integer rentPeriod;
}
