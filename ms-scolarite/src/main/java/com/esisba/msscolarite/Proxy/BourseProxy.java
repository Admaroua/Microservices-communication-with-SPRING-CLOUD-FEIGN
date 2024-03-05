package com.esisba.msscolarite.Proxy;

import com.esisba.msscolarite.Models.Virement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "ms-bourse",url="https://localhost:8083")
public interface BourseProxy {
    //GET http://localhost:8083/virements/search/findVirementByEtudiant_IdEtudiant?ide=2&projection=toscolarite
    @GetMapping("/virements/search/findVirementByEtudiant_IdEtudiant")
    public CollectionModel<Virement> getVirements(@RequestParam("ide") Long ide,
                                                  @RequestParam("projection") String projection);
}
