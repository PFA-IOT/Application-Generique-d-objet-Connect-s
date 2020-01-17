package Naoufal.Sarf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import Naoufal.Sarf.Dao.ProduitRepository;
import Naoufal.Sarf.Models.Produit;

@SpringBootApplication
public class GestionProduitMvcApplication implements CommandLineRunner {
	
	@Autowired
	private ProduitRepository produitRepository;
	@Bean //  Pour effectuer Une injection Dans Spring  
	BCryptPasswordEncoder getBCP()
	{ 
		return new BCryptPasswordEncoder();
	}
	@Autowired
	BCryptPasswordEncoder bcpe;

	public static void main(String[] args) {
		SpringApplication.run(GestionProduitMvcApplication.class, args);
		
		System.out.println("*****************");

		System.out.println("Everything is good !");
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		   produitRepository.save(new Produit("AirPods",1750,10)); ////
		  produitRepository.save(new Produit("HP OMEN",12000,5)); ////
		  produitRepository.save(new Produit("iphone 6s",4000,3)); ////
		  produitRepository.save(new Produit("Beats Pro",5000,3)); ////
		  produitRepository.save(new Produit("lunette",500,20)); ////
		  produitRepository.save(new Produit("Cartes De jeux",100,11)); ////
		  produitRepository.save(new Produit("Album",499,20)); ////
		  produitRepository.save(new Produit("Bracelet",150,50)); ////
		  produitRepository.save(new Produit("Montre Rolex",6000,3)); ////
		  produitRepository.save(new Produit("Pc fixe Hp",8200,1)); ////
		  produitRepository.save(new Produit("Cartable",500,20));
		 
		
		produitRepository.findAll().forEach(p->{
			System.out.println(p.getDesignation());
		});
		System.out.println("le mdp 3333 crypter -> "+bcpe.encode("2222"));
		System.out.println();
		
		/*
		 * System.out.println("the stream part *****");
		 * produitRepository.findAll().stream().forEach(p->{
		 * System.out.println(p.getDesignation());
		 * 
		 * });
		 */

				
	}

}
