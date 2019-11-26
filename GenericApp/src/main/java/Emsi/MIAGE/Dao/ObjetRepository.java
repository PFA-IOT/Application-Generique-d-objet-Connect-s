package Emsi.MIAGE.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import Emsi.MIAGE.Entities.Objet;

public interface ObjetRepository extends MongoRepository<Objet,Long> {

}
