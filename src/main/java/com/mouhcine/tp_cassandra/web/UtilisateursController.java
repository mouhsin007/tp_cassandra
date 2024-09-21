package com.mouhcine.tp_cassandra.web;

import com.mouhcine.tp_cassandra.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UtilisateursController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping
    public String saveUser(@RequestParam String name, int age, String email){
        return utilisateurService.saveUser( name,  age,  email);
    }
}
