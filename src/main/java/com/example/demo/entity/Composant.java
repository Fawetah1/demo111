package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;
@ManyToOne
    Menu menu;
@OneToOne
    DetailComposant detailComposant;

    // Getters and Setters
}