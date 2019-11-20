package org.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// @MapperScan(value = "org.person.mapper")

// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
