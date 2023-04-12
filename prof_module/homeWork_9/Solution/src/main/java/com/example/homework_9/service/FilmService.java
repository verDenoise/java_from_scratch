package com.example.homework_9.service;

import com.example.homework_9.model.Film;
import com.example.homework_9.model.Genre;
import com.example.homework_9.repository.DirectorRepository;
import com.example.homework_9.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class FilmService extends GenericService<Film> {

    private final FilmRepository filmRepository;
    private final DirectorRepository directorRepository;

    protected FilmService(FilmRepository filmRepository, DirectorRepository directorRepository) {
        super(filmRepository);
        this.filmRepository = filmRepository;
        this.directorRepository = directorRepository;
    }

    public List<Film> search(String title, Genre genre, String country) {
        return filmRepository.findAllByTitleOrGenreOrCountry(title, genre, country);
    }
}
