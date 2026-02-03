package org.example;

public class Institution {
    private String name;
    private String city;
    private int establishedYear;

    // Конструктор
    public Institution(String name, String city, int establishedYear) {
        this.name = name;
        this.city = city;
        this.establishedYear = establishedYear;
    }

    // JSON үшін Getter-лер (міндетті)
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getEstablishedYear() { return establishedYear; }
}
