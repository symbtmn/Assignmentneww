package org.example;

public class Teacher {
    private String name;
    private String subject;

    // Конструктор
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // JSON үшін Getter-лер (міндетті)
    public String getName() { return name; }
    public String getSubject() { return subject; }

    // Setter-лер (керек болса)
    public void setName(String name) { this.name = name; }
    public void setSubject(String subject) { this.subject = subject; }
}