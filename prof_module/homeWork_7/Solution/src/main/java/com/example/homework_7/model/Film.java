package com.example.homework_7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "films")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "premier_year")
    private Date premierYear;

    @Column(name = "country")
    private String country;

    @Enumerated
    @Column(name = "genre")
    private Genre genre;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "films_directors",
            joinColumns = @JoinColumn(name = "films_id"),
            foreignKey = @ForeignKey(name = "FK_FILMS_DIRECTORS"),
            inverseJoinColumns = @JoinColumn(name = "directors_id"),
            inverseForeignKey = @ForeignKey(name = "FK_DIRECTORS_FILMS")
    )
    private Set<Director> directors = new HashSet<>();
}
