package com.beesidk.projet.repository;

import com.beesidk.projet.entity.AppUser;
import com.beesidk.projet.entity.Cour;
import com.beesidk.projet.entity.Inscription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscriptionRepository extends MongoRepository<Inscription, String> {

    List<Inscription> findAllByUser(AppUser user);

    boolean existsByUserAndCour(AppUser user, Cour cour);
}

