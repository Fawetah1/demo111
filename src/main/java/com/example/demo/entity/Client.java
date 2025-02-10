package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String identifiant;
    private Date datePremiereVisite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Commande> commandes;
}
