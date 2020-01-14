package Emsi.MIAGE.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Emsi.MIAGE.models.Document;

public interface DocumentRepository extends JpaRepository<Document,Long> {

}
