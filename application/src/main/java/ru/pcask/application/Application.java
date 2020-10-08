package ru.pcask.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"ru.pcask.clients",
                                            "ru.pcask.activities"
                                           })
@EntityScan(value={"ru.pcask.clients",
                   "ru.pcask.activities"})
@EnableJpaRepositories(value={"ru.pcask.clients",
                       "ru.pcask.activities"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}