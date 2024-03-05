package com.esisba.msscolarite.Proxy;

import com.esisba.msscolarite.Models.Formation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation", url="http://localhost:8081")
public interface FormationProxy {

    @GetMapping("/formations/{id}")
    Formation getFormation(@PathVariable("id") Long id);
}
