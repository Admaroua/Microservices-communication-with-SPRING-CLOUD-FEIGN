package com.esisba.msformation.Models;

import com.esisba.msformation.Entities.Formation;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

import java.util.Date;
import java.util.List;

public class Etudiant {

    private String nomEtudiant;
    private String nomEtablissement;
}
