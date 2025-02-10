package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;
@ManyToOne
    Menu menu;
@ManyToOne
    Client client;
    // Getters and Setters
}