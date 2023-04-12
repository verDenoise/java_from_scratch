package com.example.homework_6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class User {

    private String secondName;
    private String firstName;
    private Date bitrhday;
    private String number;
    private String email;
    private String books;

}
