package com.example.homework_9.rest.controller;

import com.example.homework_9.dto.UserDto;
import com.example.homework_9.mapper.UserMapper;
import com.example.homework_9.model.Film;
import com.example.homework_9.model.User;
import com.example.homework_9.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rest/user")

public class UserController  extends GenericController<User, UserDto>{

    private final UserService service;

    protected UserController(UserService service, UserMapper mapper) {
        super(service, mapper);
        this.service = service;
    }

}
