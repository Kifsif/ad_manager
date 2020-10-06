package ru.pcask.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"ru.pcask.client",
                                            "ru.pcask.activities_type"
                                           })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}