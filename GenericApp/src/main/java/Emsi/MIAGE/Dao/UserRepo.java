package Emsi.MIAGE.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import Emsi.MIAGE.Entities.Role;

public interface UserRepo extends MongoRepository<Role, Long> {
	

}
