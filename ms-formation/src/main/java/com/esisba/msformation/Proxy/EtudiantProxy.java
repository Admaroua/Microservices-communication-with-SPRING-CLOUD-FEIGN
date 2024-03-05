package com.esisba.msformation.Proxy;

import com.esisba.msformation.Models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "ms-scolarite", url = "https://localhost:8082")
public interface EtudiantProxy {
    @GetMapping("/etudiants/search/findEtudiantByIdFormation")
    CollectionModel<Etudiant> getLesEtudiants(@RequestParam("idf") Long idf,
                                              @RequestParam("projection") String projection);
}
