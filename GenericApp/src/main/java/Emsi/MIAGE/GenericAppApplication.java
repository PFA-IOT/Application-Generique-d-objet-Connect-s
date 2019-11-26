package Emsi.MIAGE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Emsi.MIAGE.Dao.AxeRepository;
import Emsi.MIAGE.Dao.CapteurRepository;
import Emsi.MIAGE.Dao.DocumentSpecifiqueRepository;
import Emsi.MIAGE.Dao.InformationRepository;
import Emsi.MIAGE.Dao.ObjetRepository;
import Emsi.MIAGE.Dao.TypeCapteurRepository;
import Emsi.MIAGE.Dao.ZoneRepository;
import Emsi.MIAGE.Entities.Axe;
import Emsi.MIAGE.Entities.Capteur;
import Emsi.MIAGE.Entities.DocumentSpecifique;
import Emsi.MIAGE.Entities.Information;
import Emsi.MIAGE.Entities.Objet;
import Emsi.MIAGE.Entities.TypeCapteur;
import Emsi.MIAGE.Entities.Zone;

@SpringBootApplication
public class GenericAppApplication implements CommandLineRunner {
	@Autowired
	private AxeRepository axeRepository;
	@Autowired
	private CapteurRepository capteurRepository;
	@Autowired
	private DocumentSpecifiqueRepository DOC;
	@Autowired
	private ObjetRepository objetRepository;
	@Autowired
	private InformationRepository informationRepository;
	@Autowired
	private TypeCapteurRepository typeCapteurRepository;
	@Autowired
	private ZoneRepository zoneRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GenericAppApplication.class, args);
		System.out.println("***************************************************");
		System.out.println("it's working Perfectely !!! ");
	}
	@Override
	public void run(String... args) throws Exception {
		
		//test Axe
		axeRepository.save(new Axe(1L,"Specification 1"));
		axeRepository.save(new Axe(2L,"Specification 2"));
		

		//test Des Capteurs
		capteurRepository.save(new Capteur(1L,"Capteur1","Naoufal","Analogique",10,58));
		capteurRepository.save(new Capteur(2L,"Capteur2","Imad","Numerique",5,100));
		
		
		//test  Document Specifique 
		DOC.save(new DocumentSpecifique(1L,"Description 1"));
		DOC.save(new DocumentSpecifique(2L,"Description 2"));
		
		
		//test Objet
		objetRepository.save(new Objet(1L,"Appareil 1","Rapide et possede Une portée remarquable"));
		objetRepository.save(new Objet(2L,"Appareil 2","efficace en cas de panne ou chute d'electricité"));
		
		
		//test Information
		informationRepository.save(new Information(1L,"465vr4ve4564v15484ve56",25,4,5,6,9,9,4));
		informationRepository.save(new Information(2L,"465vr4v79cdvsgv564v15484ve56",25,4,5,6,9,9,4));
		
		
		//test typeCapteur 
		typeCapteurRepository.save(new TypeCapteur(1L,"type 1 de Categorie"));
		typeCapteurRepository.save(new TypeCapteur(2L,"type 2 de Categorie"));
		
		
		//test Zone
		zoneRepository.save(new Zone(1L,"RABAT"));
		zoneRepository.save(new Zone(1L,"CASABLANCA"));

		

		

		
		


		
		
		

		
	}

}
