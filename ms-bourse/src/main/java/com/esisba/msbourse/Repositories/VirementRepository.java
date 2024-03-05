package com.esisba.msbourse.Repositories;

import com.esisba.msbourse.Entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VirementRepository extends JpaRepository<Virement,Long> {
    //Get http://localhost:8083/virements/search/findVirementByEtudiant_IdEtudiant?ide=2
    List<Virement> findVirementByEtudiant_IdEtudiant(Long ide);
}
