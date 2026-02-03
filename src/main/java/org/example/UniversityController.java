package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UniversityController {

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return List.of(
                new Student("Adambek Aikyn", 3.8),
                new Student("Mendigali Erasyl", 3.7),
                new Student("Melden Tomiris", 3.9),
                new Student("Orken Damira", 3.6),
                new Student("Makhambetkul Nurdaulet", 3.5),
                new Student("Zainiddinuly Nursultan", 3.8)

        );
    }

    @GetMapping("/api/teachers")
    public List<Teacher> getTeachers() {
        return List.of(
                new Teacher("Orazova Arailym", "Object-Oriented Programming"),
                new Teacher("Alua Myrzakul", "Database Systems"),
                new Teacher("Duman Marat", "Discrete Math"),
                new Teacher("Askar Akshabayev", "Algorithm Design")
        );
    }

    @GetMapping("/api/institutions")
    public List<Institution> getInstitutions() {
        return List.of(
                new Institution("ASTANA IT UNIVERSITY", "Astana", 2019),
                new Institution("ENU", "Astana", 1996)


        );
    }
}