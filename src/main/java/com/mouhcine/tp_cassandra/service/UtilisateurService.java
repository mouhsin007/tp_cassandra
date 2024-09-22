package com.mouhcine.tp_cassandra.service;

import com.mouhcine.tp_cassandra.entities.Utilisateurs;
import com.mouhcine.tp_cassandra.repository.UtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateursRepository utilisateursRepository;

    public String saveUser(String name, int age, String email){
        Utilisateurs utilisateurs = new Utilisateurs();
        utilisateurs.setId(UUID.randomUUID());
        utilisateurs.setAge(age);
        utilisateurs.setName(name);
        utilisateurs.setEmail(email);
        utilisateursRepository.save(utilisateurs);

        return "save user";
    }
}
