package ru.pcask.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"ru.pcask.client"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}