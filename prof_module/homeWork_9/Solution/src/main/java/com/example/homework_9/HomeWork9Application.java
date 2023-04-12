package com.example.homework_9;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HomeWork9Application {

    public static void main(String[] args) {
        SpringApplication.run(HomeWork9Application.class, args);
        log.info("Swagger-ui run on: http://localhost:9090/swagger-ui/index.html");

    }
}
