package com.example.homework_9.dto;

import com.example.homework_9.service.DirectorService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DirectorWithFilmsDto extends DirectorDto {
    private Set<FilmDto> films;
}
