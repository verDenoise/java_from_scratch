package com.example.homework_8.rest.controller;

import com.example.homework_8.model.User;
import com.example.homework_8.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("No find user"));
    }


}
