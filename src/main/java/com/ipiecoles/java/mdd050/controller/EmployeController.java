package com.ipiecoles.java.mdd050.controller;

import com.ipiecoles.java.mdd050.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    @Autowired
    private EmployeRepository employeRepository;

    @RequestMapping("/count")
    //@RequestMapping(value = "/count", method = RequestMethod.GET)
    //@GetMapping("/count")
    public long countEmployes(){
        //Récupérer le nombre d'employés et l'envoyer au client
        return employeRepository.count();
    }
}
