package ru.pcask.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"ru.pcask.client",
                                            "ru.pcask.activities_type"
                                           })
@EntityScan(value={"ru.pcask.client",
                   "ru.pcask.activities_type"})
@EnableJpaRepositories(value={"ru.pcask.client",
                       "ru.pcask.activities_type"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}