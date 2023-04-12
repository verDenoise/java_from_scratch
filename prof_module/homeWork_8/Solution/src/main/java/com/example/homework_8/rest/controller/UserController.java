package com.example.homework_8.rest.controller;

import com.example.homework_8.model.User;
import com.example.homework_8.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @Operation(description = "Получить список всех пользователей", method = "FindAll")
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @Operation(description = "Получить пользователя по id", method = "FindById")
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Not found user"));
    }

    @Operation(description = "Создать пользователя", method = "CreateUser")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User resource) {
        return repository.save(resource);
    }

    @Operation(description = "Обновить пользователя", method = "UpdateUser")
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody User resource) {
        repository.save(resource);
    }

    @Operation(description = "Удалить пользователя", method = "DeleteUser")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

}
