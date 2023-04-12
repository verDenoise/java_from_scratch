package com.example.homework_9.service;

import com.example.homework_9.dto.AddFilmDto;
import com.example.homework_9.model.Director;
import com.example.homework_9.model.Film;
import com.example.homework_9.model.GenericModel;
import com.example.homework_9.model.Order;
import com.example.homework_9.repository.DirectorRepository;
import com.example.homework_9.repository.FilmRepository;
import com.example.homework_9.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DirectorService extends GenericService<Director> {

    private final DirectorRepository directorRepository;
    private final FilmService filmService;
    private final FilmRepository filmRepository;

    private final OrderRepository orderRepository;

    protected DirectorService(DirectorRepository directorRepository, FilmService filmService, FilmRepository filmRepository, OrderRepository orderRepository) {
        super(directorRepository);
        this.directorRepository = directorRepository;
        this.filmService = filmService;
        this.filmRepository = filmRepository;
        this.orderRepository = orderRepository;
    }

    public Director addFilm(AddFilmDto addFilmDto) {
        Director director = getOne(addFilmDto.getDirectorId());
        Film film = filmService.getOne(addFilmDto.getFilmId());
        director.getFilms().add(film);
        return update(director);
    }

    @Override
    public void delete(Long id) {

        List<Film> films = filmRepository.findFilmsByDirectorsId(id);
        if(films.isEmpty()) {
            directorRepository.deleteById(id);
            return;
        }
        List<Long> filmsIds = films.stream().map(Film::getId).toList();

        List<Long> filmsWithDirector = filmRepository.findAllFilmsWhereDirectorIsOne(filmsIds);
        if (filmsWithDirector.isEmpty()) {
            throw new UnsupportedOperationException("Cannot delete director, the contestant is present in the film(s) with other directors");
        }

        List<Long> filmsIsReturned = filmRepository.filmsIsReturned(id, filmsWithDirector, false);
        if(filmsIsReturned.isEmpty()){
            filmsIsReturned = filmRepository.filmsIsReturned(id, filmsWithDirector, true);
            if(!filmsIsReturned.isEmpty()){
                List<Long> orderListIds = filmRepository.getOrdersByFilmsToDelete(id, filmsIsReturned);
                for (Long orderId : orderListIds) {
                    orderRepository.findById(orderId).get().setFilm(null);
                }
                for (Long idFilm: filmsIsReturned) {
                    filmRepository.deleteById(idFilm);
                }
            }else{
                directorRepository.deleteById(id);
            }
        }else{
            throw new UnsupportedOperationException("Cannot delete director, where film is rent");
        }


    }
}
