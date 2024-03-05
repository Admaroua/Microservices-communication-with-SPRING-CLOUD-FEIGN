package com.esisba.msbourse.Repositories;

import com.esisba.msbourse.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
