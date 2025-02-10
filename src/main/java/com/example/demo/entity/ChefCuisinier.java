package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    public TypeChef typeChef;
    @ManyToMany(mappedBy="chefCuisiniers", cascade = CascadeType.ALL)//fetch= fetchtype lazy and eager
    private Set<Menu> menu;
    // Getters and Setters
}

