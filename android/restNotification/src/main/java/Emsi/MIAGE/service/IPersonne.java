package Emsi.MIAGE.service;

import java.util.List;

import Emsi.MIAGE.models.Personne;

public interface IPersonne {
	
	void save (Personne personne);
	void update(Long id,Personne personne);
	List<Personne> getPersonnes();
	Personne getPersonne(Long id);
	void SendEmail(String email,String destinataire);

}
