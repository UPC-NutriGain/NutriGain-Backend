package com.acme.nutrigain.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/**
 * LearningCenterPlatformApplication
 *
 * @summary
 * The main class of the Learning Center Platform application.
 * It is responsible for starting the Spring Boot application.
 * It also enables JPA auditing.
 *
 * @since 1.0
 */
@EnableJpaAuditing

@SpringBootApplication
public class NutrigainBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NutrigainBackendApplication.class, args);
    }

}
