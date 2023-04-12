package com.example.homework_6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.example.homework_6.DBConstants.PASSWORD;
import static com.example.homework_6.DBConstants.USER;

@Configuration
public class DBConfig {

    @Bean
    @Scope("singleton")
    public Connection connection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/DB_learning",
                USER,
                PASSWORD);
    }
}
