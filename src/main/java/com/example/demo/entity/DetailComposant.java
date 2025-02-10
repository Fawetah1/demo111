package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;
    private Float imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    // Getters and Setters
}

 enum TypeComposant {
    VIANDE_BLANCHE, VIANDE_ROUGE, CEREALE
}