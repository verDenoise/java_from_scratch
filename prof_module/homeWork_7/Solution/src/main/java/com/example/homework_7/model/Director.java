package com.example.homework_7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "directors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "directors_fio")
    private String directorsFIO;

    @Column(name = "position")
    private String position;

    @ManyToMany(mappedBy = "directors", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private Set<Film> films = new HashSet<>();

}
