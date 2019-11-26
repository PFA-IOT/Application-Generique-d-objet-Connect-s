package Emsi.MIAGE.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import Emsi.MIAGE.Entities.TypeCapteur;

public interface TypeCapteurRepository extends MongoRepository<TypeCapteur,Long> {

}
