package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository ){
        return args -> {
            Student Thiago = new Student (
                    "Thiago",
                    "thiago@student.com",
                    LocalDate.of(1990, OCTOBER, 04)

            );
            repository.saveAll(List.of(Thiago));

        };

    }

}
