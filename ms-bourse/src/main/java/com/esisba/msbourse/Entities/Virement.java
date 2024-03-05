package com.esisba.msbourse.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVirement;
    public Float montant;
    @Temporal(TemporalType.DATE)
    private Date dateVirement;
    @ManyToOne(fetch = FetchType.EAGER)
    public Etudiant etudiant;
}
