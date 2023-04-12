package com.example.homework_8.dto;

import com.example.homework_8.model.Director;
import com.example.homework_8.model.Genre;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmDto {

    private long id;
    private String title;
    private Date premierYear;
    private String country;
    private Genre genre;
    private Set<Director> directors;
}
