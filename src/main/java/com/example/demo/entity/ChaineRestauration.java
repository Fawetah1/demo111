package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
public class ChaineRestauration {//implements serializable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="chaineRestauration")
    private Set<restaurant> restaurants;
    // Getters and Setters

}
