package com.example.nimapmt.model;


import jakarta.persistence.*;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Or another strategy
    private Long id;

    private String name;
    private Double price;
    private String description;

    // Getters and setters
}
