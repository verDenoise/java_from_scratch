package com.example.homework_9.service;

import com.example.homework_9.dto.PurchaseFilmDto;
import com.example.homework_9.dto.RentFilmDto;
import com.example.homework_9.mapper.OrderMapper;
import com.example.homework_9.model.Film;
import com.example.homework_9.model.Order;
import com.example.homework_9.model.Role;
import com.example.homework_9.model.User;
import com.example.homework_9.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Service
public class OrderService extends GenericService<Order> {

    private final OrderRepository repository;
    private final UserService userService;
    private final FilmService filmService;

    protected OrderService(OrderRepository repository, UserService userService, FilmService filmService) {
        super(repository);
        this.repository = repository;
        this.userService = userService;
        this.filmService = filmService;
    }

    public Order rentFilm(RentFilmDto rentFilmDto){
        User user = userService.getOne(rentFilmDto.getUserId());
        Film film = filmService.getOne(rentFilmDto.getFilmId());

        Order order = Order.builder()
                .rentDate(LocalDateTime.now())
                .returnDate(LocalDateTime.now().plusDays(rentFilmDto.getRentPeriod()))
                .rentPeriod(rentFilmDto.getRentPeriod())
                .returned(false)
                .purchase(false)
                .amount(rentFilmDto.getAmount())
                .user(user)
                .film(film)
                .build();
        return repository.save(order);
    }

    public Order purchaseFilm(PurchaseFilmDto purchaseFilmDto){
        User user = userService.getOne(purchaseFilmDto.getUserId());
        Film film = filmService.getOne(purchaseFilmDto.getFilmId());

        Order order = Order.builder()
                .rentDate(LocalDateTime.now())
                .returnDate(LocalDateTime.now())
                .rentPeriod(0)
                .returned(false)
                .purchase(true)
                .amount(purchaseFilmDto.getAmount())
                .user(user)
                .film(film)
                .build();
        return repository.save(order);
    }

    public List<Order> getUserOrders(Long userID){
        return userService.getOne(userID).getOrder().stream().toList();//это плохо или нет?
    }

}
