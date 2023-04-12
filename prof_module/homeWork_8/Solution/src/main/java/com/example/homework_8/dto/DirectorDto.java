package com.example.homework_8.dto;

import com.example.homework_8.model.Film;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectorDto {

    private long id;
    private String directorsFIO;
    private String position;
    private Set<Film> films;

}
