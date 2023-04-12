package com.example.homework_9.service;

import com.example.homework_9.model.Role;
import com.example.homework_9.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public List<Role> getList() {
        return repository.findAll();
    }

}
