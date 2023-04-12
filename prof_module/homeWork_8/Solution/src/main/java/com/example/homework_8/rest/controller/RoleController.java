package com.example.homework_8.rest.controller;

import com.example.homework_8.model.Role;
import com.example.homework_8.repository.RoleRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/role")
public class RoleController {
    @Autowired
    private RoleRepository repository;

    @Operation(description = "Получить список всех ролей", method = "FindAll")
    @GetMapping
    public ResponseEntity<List<Role>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }

}
