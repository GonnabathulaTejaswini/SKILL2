package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String city;

    public Student() {}

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
