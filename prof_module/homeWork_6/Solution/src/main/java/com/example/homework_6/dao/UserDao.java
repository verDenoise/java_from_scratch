package com.example.homework_6.dao;

import com.example.homework_6.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@Scope("prototype")
public class UserDao {
    private final Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public void create(User user) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("insert into clients (second_name, first_name, bitrhday, number, email, books)values (?,?,?,?,?,?)");

        preparedStatement.setString(1, user.getSecondName());
        preparedStatement.setString(2, user.getFirstName());
        preparedStatement.setDate(3, (Date) user.getBitrhday());
        preparedStatement.setString(4, user.getNumber());
        preparedStatement.setString(5, user.getEmail());
        preparedStatement.setString(6, user.getBooks());

        preparedStatement.executeUpdate();

    }

    public List<String> namesOfBooksThisHuman(String email) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT books from clients where email = ?");

        preparedStatement.setString(1, email);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<String> listOfNameBooks = new ArrayList<>();

        String text = "";
        if (resultSet.next()) {
            text = resultSet.getString("books");
        }

        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(text);

        List<String> lst = new ArrayList<>();
        while (matcher.find()) {
            listOfNameBooks.add(matcher.group(1));
        }

        return listOfNameBooks;
    }
}

