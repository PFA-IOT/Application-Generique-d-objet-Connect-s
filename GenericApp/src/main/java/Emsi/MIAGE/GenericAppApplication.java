package Emsi.MIAGE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Emsi.MIAGE.Dao.AxeRepository;
import Emsi.MIAGE.Entities.Axe;

@SpringBootApplication
public class GenericAppApplication implements CommandLineRunner {
	@Autowired
	AxeRepository axeRepository;
	public static void main(String[] args) {
		SpringApplication.run(GenericAppApplication.class, args);
		System.out.println("***************************************************");
		System.out.println("it's working Perfectely !!! ");
	}
	@Override
	public void run(String... args) throws Exception {
		
		axeRepository.save(new Axe(1L,"test"));
		
	}

}
