package Emsi.MIAGE.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Emsi.MIAGE.Entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
