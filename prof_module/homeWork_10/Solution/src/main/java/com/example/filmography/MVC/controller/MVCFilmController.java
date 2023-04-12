package com.example.filmography.MVC.controller;

import com.example.filmography.dto.DirectorDto;
import com.example.filmography.dto.FilmDto;
import com.example.filmography.mapper.FilmMapper;
import com.example.filmography.model.Film;
import com.example.filmography.service.FilmService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/films")
public class MVCFilmController {

    private final FilmService service;

    private final FilmMapper mapper;

    public MVCFilmController(FilmService service, FilmMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("")
    public String getAll(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "5") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page - 1, pageSize, Sort.by(Sort.Direction.ASC, "title"));
        Page<Film> filmPage = service.listAllPaginated(pageRequest);
        List<FilmDto> filmDtos = filmPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("films", new PageImpl<>(filmDtos, pageRequest, filmPage.getTotalElements()));
        return "films/viewAllFilms";
    }


    @GetMapping("/add")
    public String create() {
        return "films/addFilm";
    }

    @PostMapping("/add")
    public String create(@ModelAttribute("filmsForm") FilmDto filmDto) {
        service.create(mapper.toEntity(filmDto));
        return "redirect:/films";
    }
}
