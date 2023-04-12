package com.example.homework_9.dto;

import lombok.Data;

@Data
public class PurchaseFilmDto {
    Long filmId;
    Long userId;
    Integer amount;
}
