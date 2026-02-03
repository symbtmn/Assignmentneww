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
                new Student("Zainiddinuly Nursultan", 3.8),
                new Student("Shayakhmet Botagoz", 3.9),
                new Student("Arap Ayaulym", 3.7),
                new Student("Safina Amina", 4.0),
                new Student("Abilkhan Khamza", 3.4),
                new Student("Tilektes Aknur", 3.8),
                new Student("Esengali Moldir", 3.7),
                new Student("Kylyshbek Sabina", 3.9),
                new Student("Aidyn Saida", 3.6),
                new Student("Korkembek Eldos", 3.5),
                new Student("Abildin Aldiyar", 3.7),
                new Student("Tolegen Ayazhan", 3.8),
                new Student("Erik Ersultan", 3.4),
                new Student("Esengeldi Nuray", 3.9),
                new Student("Koylash Aybar", 3.6),
                new Student("Adilbay Zangar", 3.7),
                new Student("Altaubaev Eldos", 3.5),
                new Student("Temirkhan Shugyla", 3.9),
                new Student("Absattar Mukhammedali", 3.8),
                new Student("Yntymak Ryskedi", 3.6),
                new Student("Magzum Aisana", 4.0),
                new Student("Malibek Alibek", 3.7),
                new Student("Zagiyalova Erke", 3.8),
                new Student("Tuimebay Daryn", 3.5),
                new Student("Toktagan Erasyl", 3.7),
                new Student("Erzhigitova Diana", 3.9),
                new Student("Shamaev Ilyas", 3.6),
                new Student("Omirbek Dastan", 3.5),
                new Student("Amanzhol Nurasyl", 3.7),
                new Student("Konakbay Alisher", 3.8),
                new Student("Oralbek Nursultan", 3.6),
                new Student("Murat Malika", 3.9),
                new Student("Bimurzakizi Moldir", 3.7),
                // Қалғандарын да осылай үтір арқылы жалғастыра беруге болады
                new Student("Ratbek Ayaulym", 3.8),
                new Student("Kasymbek Balym", 3.9),
                new Student("Amandyk Mansur", 3.7),
                new Student("Nurzhan Makhabbat", 3.8),
                new Student("Sultan Ziyada", 3.9),
                new Student("Ausadyk Nurasyl", 3.6)
        );
    }

    @GetMapping("/api/teachers")
    public List<Teacher> getTeachers() {
        return List.of(
                new Teacher("Orazova Arailym", "Object-Oriented Programming"),
                new Teacher("Alua Myrzakul", "Database Systems"),
                new Teacher("Duman Marat", "Discrete Math"),
                new Teacher("Askar Akshabayev", "Algorithm Design"),
                new Teacher("Bakhyt Batyrbekov", "Network Security"),
                new Teacher("Aigerim Yerbolatova", "Data Science"),
                new Teacher("Sanzhar Korgasbekov", "Artificial Intelligence"),
                new Teacher("Gulmira Abdrakhmanova", "Web Development")
        );
    }

    @GetMapping("/api/institutions")
    public List<Institution> getInstitutions() {
        return List.of(
                new Institution("ENU", "Astana", 1996),
                new Institution("Turan", "Astana", 1992)

        );
    }
}