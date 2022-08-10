package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

           Student MAAMRA = new Student(

                    "MAAMRA",
                    "abdel.fetah99@gmail.com",
                    LocalDate.of(1999, Month.JUNE,22)

           );
           Student alex = new Student(

                    "ALEX",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.APRIL,2)

           );

           repository.saveAll(List.of(MAAMRA,alex));
        };
    }
}
