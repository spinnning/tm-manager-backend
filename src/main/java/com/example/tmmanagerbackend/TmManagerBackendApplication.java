package com.example.tmmanagerbackend;

import com.example.tmmanagerbackend.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class TmManagerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmManagerBackendApplication.class, args);

    }
    @GetMapping
    public List<Student> hello() {
        return List.of(
            new Student(
                1L,
                "Mariam",
                "mariam.jamal@gmail.com",
                21,
                LocalDate.of(2000, Month.JANUARY, 5)
            )
        );
    }

}
