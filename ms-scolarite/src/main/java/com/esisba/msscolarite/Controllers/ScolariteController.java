package com.esisba.msscolarite.Controllers;


import com.esisba.msscolarite.Entities.Etudiant;
import com.esisba.msscolarite.Models.Formation;
import com.esisba.msscolarite.Proxy.BourseProxy;
import com.esisba.msscolarite.Proxy.FormationProxy;
import com.esisba.msscolarite.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class ScolariteController {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    FormationProxy formationProxy;
    @Autowired
    BourseProxy bourseProxy;
    //http://localhost:8082/api/etudiants/1
    @GetMapping("/etudiants/{ide}")
    public ResponseEntity<?> getEtudiantWithFormationVirements(@PathVariable Long ide) {
        Etudiant etudiant = etudiantRepository.findById(ide).orElse(null);
        if (etudiant != null) {
            // Call Formation service via Feign client to get formation details
            Formation formation = formationProxy.getFormation(etudiant.getIdFormation());
            etudiant.setVirements(new ArrayList(bourseProxy.getVirements(ide,"toscolarite").getContent()));
            etudiant.setFormation(formation);
            return ResponseEntity.ok(etudiant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/etudiants/search/findEtudiantByIdFormation")
    List<Etudiant> getEtudiantByFormation(@RequestParam("idf") Long idf){
        return etudiantRepository.findEtudiantByIdFormation(idf);
    }
}


