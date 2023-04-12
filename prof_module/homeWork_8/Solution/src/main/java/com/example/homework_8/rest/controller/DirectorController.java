package com.example.homework_8.rest.controller;

import com.example.homework_8.model.Director;
import com.example.homework_8.model.User;
import com.example.homework_8.repository.DirectorRepository;
import com.example.homework_8.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
@RequestMapping("/rest/directors")
public class DirectorController {

    @Autowired
    private DirectorRepository repository;

    @Operation(description = "Получить список всех режиссеров", method = "FindAll")
    @GetMapping
    public ResponseEntity<List<Director>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @Operation(description = "Получить режиссера по id", method = "FindById")
    @GetMapping(value = "/{id}")
    public Director findById(@PathVariable("id") Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Not found user"));
    }

    @Operation(description = "Создать режиссера", method = "Create")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Director create(@RequestBody Director resource) {
        return repository.save(resource);
    }

    @Operation(description = "Обновить режиссера", method = "Update")
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Director resource) {
        repository.save(resource);
    }

    @Operation(description = "Удалить режиссера", method = "Delete")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

}
