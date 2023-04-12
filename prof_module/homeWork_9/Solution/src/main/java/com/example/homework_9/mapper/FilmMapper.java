package com.example.homework_9.mapper;

import com.example.homework_9.dto.FilmDto;
import com.example.homework_9.model.Film;
import com.example.homework_9.model.GenericModel;
import com.example.homework_9.repository.DirectorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class FilmMapper extends GenericMapper<Film, FilmDto>{

    private final ModelMapper mapper;
    private final DirectorRepository directorRepository;
    protected FilmMapper(ModelMapper mapper, DirectorRepository directorRepository) {
        super(mapper, Film.class, FilmDto.class);
        this.mapper = mapper;
        this.directorRepository = directorRepository;
    }

    @PostConstruct
    public void setupMapper() {
        mapper.createTypeMap(Film.class, FilmDto.class)
                .addMappings(m -> m.skip(FilmDto::setDirectorsIds)).setPostConverter(toDtoConverter());
        mapper.createTypeMap(FilmDto.class, Film.class)
                .addMappings(m -> m.skip(Film::setDirectors)).setPostConverter(toEntityConverter());
    }

    @Override
    void mapSpecificFields(FilmDto source, Film destination) {
        destination.setDirectors(directorRepository.findAllByIdIn(source.getDirectorsIds()));
    }

    @Override
    void mapSpecificFields(Film source, FilmDto destination) {
        destination.setDirectorsIds(getIds(source));
    }

    private Set<Long> getIds(Film film) {
        return Objects.isNull(film) || Objects.isNull(film.getId())
                ? null
                : film.getDirectors().stream()
                .map(GenericModel::getId)
                .collect(Collectors.toSet());
    }


}
