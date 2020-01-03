package com.ipiecoles.java.mdd050.controller;

import com.ipiecoles.java.mdd050.model.Employe;
import com.ipiecoles.java.mdd050.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /*@RequestMapping(value = "/6", method = RequestMethod.GET)
    public Employe getEmployeById(){
        //Récupérer le nombre d'employés et l'envoyer au client
        //return employeRepository.findById(6L).get();
        return employeRepository.findOne(6L);
    }*/

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employe findById(@PathVariable(value = "id") Long id)
    {
        return employeRepository.findOne(id);
    }
}
