package com.example.filmography.service;

import com.example.filmography.model.User;
import com.example.filmography.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service

public class UserService extends GenericService<User>{


    protected UserService(GenericRepository<User> repository) {
        super(repository);
    }
}
