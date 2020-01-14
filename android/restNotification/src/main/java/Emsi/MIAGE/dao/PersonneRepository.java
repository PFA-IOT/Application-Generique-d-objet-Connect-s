package Emsi.MIAGE.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Emsi.MIAGE.models.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
