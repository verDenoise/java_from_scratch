package com.example.homework_8.rest.controller;

import com.example.homework_8.model.Director;
import com.example.homework_8.model.Order;
import com.example.homework_8.repository.DirectorRepository;
import com.example.homework_8.repository.OrderRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
@RequestMapping("/rest/orders")
public class OrderController {

    @Autowired
    private OrderRepository repository;

    @Operation(description = "Получить список всех заказов", method = "FindAll")
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @Operation(description = "Получить заказ по id", method = "FindById")
    @GetMapping(value = "/{id}")
    public Order findById(@PathVariable("id") Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Not found user"));
    }

    @Operation(description = "Создать заказ", method = "Create")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order resource) {
        return repository.save(resource);
    }

    @Operation(description = "Обновить заказ", method = "Update")
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Order resource) {
        repository.save(resource);
    }

    @Operation(description = "Удалить заказ", method = "Delete")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

}
