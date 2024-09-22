package com.mouhcine.tp_cassandra.web;

import com.mouhcine.tp_cassandra.entities.Utilisateurs;
import com.mouhcine.tp_cassandra.repository.UtilisateursRepository;
import com.mouhcine.tp_cassandra.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UtilisateursController {
    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private UtilisateursRepository utilisateursRepository;

    @PostMapping
    public String saveUser(@RequestParam String name, int age, String email){
        return utilisateurService.saveUser( name,  age,  email);
    }
    @GetMapping
    public List<Utilisateurs> saveUser(){
        return utilisateursRepository.findAll();
    }
}
