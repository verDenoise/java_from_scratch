package com.example.homework_8.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDto {

    private long id;
    private String title;
    private String description;
}
