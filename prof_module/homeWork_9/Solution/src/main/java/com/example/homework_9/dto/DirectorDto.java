package com.example.homework_9.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectorDto extends GenericDto{

    private String directorsFIO;
    private String position;
    private Set<Long> filmsIds;

}
