package Emsi.MIAGE.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import Emsi.MIAGE.Entities.DocumentSpecifique;

public interface DocumentSpecifiqueRepository extends MongoRepository<DocumentSpecifique,Long> {

}
