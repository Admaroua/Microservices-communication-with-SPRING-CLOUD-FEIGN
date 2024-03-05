package com.esisba.msbourse.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private Long nCompteCCP;
    private Float salaireParent;
    private Boolean situationImpot;
    @OneToMany(mappedBy = "etudiant")
    List <Virement> virements;
}
