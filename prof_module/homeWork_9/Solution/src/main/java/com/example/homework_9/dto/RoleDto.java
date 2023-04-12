package com.example.homework_9.dto;

import com.example.homework_9.model.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDto{

    private long id;
    private String title;
    private String description;

    public RoleDto (Role role) {
        this.id = role.getId();
        this.title = role.getTitle();
        this.description = role.getDescription();
    }

}
