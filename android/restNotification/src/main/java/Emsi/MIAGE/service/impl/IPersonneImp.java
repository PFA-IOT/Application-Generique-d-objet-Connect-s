package Emsi.MIAGE.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Emsi.MIAGE.dao.PersonneRepository;
import Emsi.MIAGE.messaging.Mail;
import Emsi.MIAGE.models.Personne;
import Emsi.MIAGE.service.IPersonne;

@Service
public class IPersonneImp implements IPersonne {
	@Autowired
	private PersonneRepository personneRepository;

	@Override
	public void save(Personne personne) 
	{
		personneRepository.save(personne);
	}

	@Override
	public void update(Long id, Personne personne) {
		Personne currentPerso = getPersonne(id);
		if(currentPerso != null)
		{
			personne.setId(id);
			personneRepository.save(personne);
		}

	}

	@Override
	public List<Personne> getPersonnes() {
		return personneRepository.findAll();
	}

	@Override
	public Personne getPersonne(Long id) {
		boolean trouver=personneRepository.existsById(id);
		if(trouver) return personneRepository.getOne(id);
		else return null;
	}

	@Override
	public void SendEmail(String email, String destinataire) {
    	try {
			Mail.sendMail(email,destinataire);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
