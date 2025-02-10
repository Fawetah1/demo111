package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;//fonction predefinie .date ajoute @temporal
import java.util.Set;

@Getter
@Setter
@Entity
//@column(name="idClient")
//fonctioin pour calculer diference entre deux date @transient
public class restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nom;
    private Long nbPlacesMax;
@ManyToOne
    ChaineRestauration chaineRestauration;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> menu;
    // Getters and Setters
}
