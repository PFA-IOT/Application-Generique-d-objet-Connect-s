package Emsi.MIAGE.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import Emsi.MIAGE.Entities.Zone;

public interface ZoneRepository extends MongoRepository<Zone,Long> {

}
