package com.example.homework_9.model;


import com.example.homework_9.dto.RoleDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public Role(RoleDto roleDto) {
        this.id = roleDto.getId();
        this.title = roleDto.getTitle();
        this.description = roleDto.getDescription();
    }

}
