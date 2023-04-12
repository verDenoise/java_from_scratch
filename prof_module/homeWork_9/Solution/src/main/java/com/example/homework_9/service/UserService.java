package com.example.homework_9.service;

import com.example.homework_9.model.User;
import com.example.homework_9.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service

public class UserService extends GenericService<User>{


    protected UserService(GenericRepository<User> repository) {
        super(repository);
    }
}
