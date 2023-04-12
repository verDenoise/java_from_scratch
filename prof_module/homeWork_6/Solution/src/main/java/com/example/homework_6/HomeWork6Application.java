package com.example.homework_6;

import com.example.homework_6.dao.BookDao;
import com.example.homework_6.dao.UserDao;
import com.example.homework_6.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeWork6Application implements CommandLineRunner {

    private final BookDao bookDao;
    private final UserDao userDao;

    public HomeWork6Application(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeWork6Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookDao.findById(4L));
        System.out.println(bookDao.findAll());

        User user1 = new User("q", "w", new java.sql.Date(1998, 06, 10), "+795", "email",
                "[Путешествие из Петербурга в Москву],[Доктор Живаго],[Недоросль]");

        User user2 = new User("Voromin", "Denise", new java.sql.Date(1997, 06, 19), "+7-920-004-11-12", "voromDen@gmail.com",
                "[Зов Ктулху], [Клуб самоубиц], [Грозовой перевал]");

        userDao.create(user1);
        userDao.create(user2);

        bookDao.printInfoAboutBooks(userDao.namesOfBooksThisHuman(user1.getEmail()));

    }
}
