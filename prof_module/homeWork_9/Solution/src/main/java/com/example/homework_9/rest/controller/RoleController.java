package com.example.homework_9.rest.controller;

import com.example.homework_9.model.Role;
import com.example.homework_9.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService service;

    public RoleController(RoleService service) {
        this.service = service;
    }

    @GetMapping("/list") //localhost:9090/role/list
    public List<Role> list() {
        return service.getList();
    }

}
