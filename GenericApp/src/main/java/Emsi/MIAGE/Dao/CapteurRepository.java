package Emsi.MIAGE.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import Emsi.MIAGE.Entities.Capteur;

public interface CapteurRepository extends MongoRepository<Capteur,Long> {

}
