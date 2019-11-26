package Emsi.MIAGE.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import Emsi.MIAGE.Entities.Information;

public interface InformationRepository extends MongoRepository<Information,Long> {

}
