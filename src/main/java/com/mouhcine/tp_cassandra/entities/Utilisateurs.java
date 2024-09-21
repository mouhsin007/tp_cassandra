package com.mouhcine.tp_cassandra.entities;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Table("Utilisateurs")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateurs implements Serializable {
    @PrimaryKey
    private UUID id;
    private String name;
    private String email;
    private int age;
}
