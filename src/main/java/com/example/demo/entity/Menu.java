package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private Float prixTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private Set<Composant> composants;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ChefCuisinier> chefCuisiniers;
    // Getters and Setters
}

