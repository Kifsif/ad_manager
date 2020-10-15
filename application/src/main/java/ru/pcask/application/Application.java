package ru.pcask.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"ru.pcask.clients",
                                            "ru.pcask.activities",
                                            "ru.pcask.agent_profiles",
                                           })

@EntityScan(value={"ru.pcask.clients",
                   "ru.pcask.activities",
                   "ru.pcask.agent_profiles", })

@EnableJpaRepositories(value={"ru.pcask.clients",
                              "ru.pcask.activities",
                              "ru.pcask.agent_profiles"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}