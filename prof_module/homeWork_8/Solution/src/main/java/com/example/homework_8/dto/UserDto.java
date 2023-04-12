package com.example.homework_8.dto;

import com.example.homework_8.model.Role;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String secondName;
    private String middleName;
    private Date birthDate;
    private String phone;
    private String address;
    private String email;
    private Date createdWhen;
    private Role role;

}
