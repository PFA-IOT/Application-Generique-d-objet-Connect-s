package Emsi.MIAGE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Emsi.MIAGE.models.Document;
import Emsi.MIAGE.models.Personne;
import Emsi.MIAGE.service.IDocument;
import Emsi.MIAGE.service.IPersonne;

@RestController
@RequestMapping("/notif")
public class NotificationController {
	@Autowired
	private IDocument iDocument;
	@Autowired
	private IPersonne iPersonne;
	
	

	

	@PostMapping("/addDocument")
	public ResponseEntity<Object> saveDocument( @RequestBody Document document) {
		iDocument.save(document);
		return new ResponseEntity<>("Employer Creer !", HttpStatus.CREATED);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<Object> update( @PathVariable Long id, @RequestBody Document document) {
		if(iDocument.getDocument(id) == null) 	return new ResponseEntity<>("Employer n'existe Pas", HttpStatus.OK);
		iDocument.update(id, document);
		return new ResponseEntity<>("Employer Modifié", HttpStatus.OK);
	}
	
	
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<Object> delete( @PathVariable Long id) {
		if(iDocument.getDocument(id) == null) return new ResponseEntity<>("Element n'existe pas ",HttpStatus.OK);
		else 
			iDocument.delete(id);
			return new ResponseEntity<>("Employer Supprimé", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/documents",produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<Document> getDocuments() {
		return iDocument.getDocuments();
	}
	
	
	@GetMapping(value="/document/{id}")
	public ResponseEntity<Object> getDocument( @PathVariable Long id) {
		return (iDocument.getDocument(id) == null) ? new ResponseEntity<>("Employer n'existe pas ", HttpStatus.OK)
				: new ResponseEntity<>(iDocument.getDocument(id), HttpStatus.OK);	}
	
	
	
	@PostMapping("/addPersonne")
	public ResponseEntity<Object> savePersonne( @RequestBody Personne personne) 
	{
		iPersonne.save(personne);
		return new ResponseEntity<>("Employer Creer !", HttpStatus.CREATED);
	}
	
	
	@PutMapping("/editPersonne/{id}")
	public ResponseEntity<Object> update( @PathVariable Long id,  @RequestBody Personne personne) 
	{
		iPersonne.update(id, personne);
		return new ResponseEntity<>("Employer Modifié", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/personnes")
	public List<Personne> getPersonnes() 
	{
		return iPersonne.getPersonnes();
	}
	
	
	@GetMapping(value="/personne/{id}")
	public ResponseEntity<Object> getPersonne( @PathVariable Long id) 
	{
		return (iPersonne.getPersonne(id) == null) ? new ResponseEntity<>("Employer n'existe pas ", HttpStatus.OK)
				:  new ResponseEntity<>(iPersonne.getPersonne(id), HttpStatus.OK);	
	}
	
	@GetMapping("/sendEmail/{email}/{destinataire}")
	public ResponseEntity<Object> SendEmail( @PathVariable String email, @PathVariable String destinataire) {
		iPersonne.SendEmail(email, destinataire);
		return new ResponseEntity<>("Email envoyer", HttpStatus.OK);
	}
	
	
	
	
}
