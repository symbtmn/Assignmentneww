package org.example;

public class Main {
    public static void main(String[] args) {

        DatabaseManager.addInstitution("Eurasian National University", "Astana", 1996);
        DatabaseManager.addInstitution("Turan University", "Astana", 1992);


        DatabaseManager.addTeacher("Alua Myrzakul", "Database Management Systems");
        DatabaseManager.addTeacher("Duman Marat", "Discrete Math");


        DatabaseManager.addStudent("Bakdaulet", "Amankan", 18, 3);
        DatabaseManager.addStudent("Imangali", "Abraim", 17, 1);

    }
}