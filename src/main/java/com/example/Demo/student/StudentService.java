package com.example.Demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student("Maher", "Ayachi", LocalDate.now(), "contact@maher.com", 22),
                new Student("ali", "Ayach", LocalDate.now(), "contact@maher.com", 21),
                new Student("houssem", "Ayachi", LocalDate.now(), "contact@maher.com", 20)

        );
    }
}
