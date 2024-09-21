package com.mouhcine.tp_cassandra.repository;


import com.mouhcine.tp_cassandra.entities.Utilisateurs;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UtilisateursRepository extends CassandraRepository<Utilisateurs,UUID>{
}
