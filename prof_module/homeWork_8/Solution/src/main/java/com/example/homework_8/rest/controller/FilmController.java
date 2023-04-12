package com.example.homework_8.rest.controller;

import com.example.homework_8.model.Film;
import com.example.homework_8.model.User;
import com.example.homework_8.repository.FilmRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
@RequestMapping("/rest/films")
public class FilmController {
    @Autowired
    private FilmRepository repository;

    @Operation(description = "Получить список всех фильмов", method = "FindAll")
    @GetMapping
    public ResponseEntity<List<Film>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @Operation(description = "Получить фильм по id", method = "FindById")
    @GetMapping(value = "/{id}")
    public Film findById(@PathVariable("id") Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Not found"));
    }

    @Operation(description = "Создать фильм", method = "Create")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Film create(@RequestBody Film resource) {
        return repository.save(resource);
    }

    @Operation(description = "Обновить фильм", method = "Update")
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Film resource) {
        repository.save(resource);
    }

    @Operation(description = "Удалить фильм", method = "Delete")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

}
