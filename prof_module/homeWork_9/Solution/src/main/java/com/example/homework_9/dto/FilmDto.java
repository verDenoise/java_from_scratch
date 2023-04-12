package com.example.homework_9.dto;

import com.example.homework_9.model.Director;
import com.example.homework_9.model.Genre;
import lombok.*;

import java.util.Date;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmDto extends GenericDto {

    private String title;
    private Date premierYear;
    private String country;
    private Genre genre;
    private Set<Long> directorsIds;
}
