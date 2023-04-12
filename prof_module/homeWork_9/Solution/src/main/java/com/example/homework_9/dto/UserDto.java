package com.example.homework_9.dto;

import com.example.homework_9.model.Role;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto extends GenericDto{

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
    private RoleDto role;

}
