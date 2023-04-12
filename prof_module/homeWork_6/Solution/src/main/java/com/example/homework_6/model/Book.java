package com.example.homework_6.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//ORM - object relational mapping (объектно реляционное отображение)
public class Book {

    private Long id;
    private String title;
    private String author;
    private Date addedDate;

}
