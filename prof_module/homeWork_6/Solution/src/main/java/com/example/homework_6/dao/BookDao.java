package com.example.homework_6.dao;

import com.example.homework_6.mapper.BookMapper;
import com.example.homework_6.model.Book;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookDao {
    private BookMapper bookMapper = new BookMapper();
    private final Connection connection;

    public BookDao(Connection connection) {
        this.connection = connection;
    }

    public Book findById(Long id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from books where id = ?");
        preparedStatement.setInt(1, Math.toIntExact(id));
        ResultSet resultSet = preparedStatement.executeQuery();
        Book book = new Book();
        while (resultSet.next()) {
            book = bookMapper.bookMapper(resultSet);
        }
        return book;
    }

    public List<Book> findAll() throws SQLException {
        List<Book> books = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from books");
        ResultSet resultSet = preparedStatement.executeQuery();
        books.addAll(bookMapper.bookMapperFromList(resultSet));
        return books;
    }

    public void printInfoAboutBooks(List<String> list) throws SQLException {
        for (String name : list) {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, title, author, date_added from books where title = ?");
            preparedStatement.setString(1, name.trim());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("id") + " " +
                                resultSet.getString("title") + " " +
                                resultSet.getString("author") + " " +
                                resultSet.getDate("date_added")
                );
            }
        }
    }

}
