package com.example.homework_8.repository;

import com.example.homework_8.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {

}
