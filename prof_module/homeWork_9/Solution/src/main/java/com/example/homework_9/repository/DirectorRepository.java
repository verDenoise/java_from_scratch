package com.example.homework_9.repository;

import com.example.homework_9.model.Director;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface DirectorRepository extends GenericRepository<Director> {
    Set<Director> findAllByIdIn(Set<Long> ids);
}
