package com.beesidk.projet.entity;


import com.beesidk.projet.enums.PaiementType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

@Document("cour")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cour {

    @Id
    String id;
    String name;
    String video;
    String affiche;
    String description;
    int duree;
    float prix;

    LocalDateTime dateCreation;
    PaiementType paiement;

    @DBRef
    Categorie categorie;

    @DBRef
    Formateur formateur;

    @DBRef(lazy = true)
    @JsonIgnore
    List<Inscription> inscriptions = new ArrayList<>();

    @DBRef(lazy = true)
    List<Tag> tags = new ArrayList<>();

    @DBRef(lazy = true)
    @JsonIgnore
    List<Avis> avis = new ArrayList<>();
}