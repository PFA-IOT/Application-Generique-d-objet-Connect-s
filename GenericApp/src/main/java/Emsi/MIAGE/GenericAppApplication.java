package Emsi.MIAGE;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GenericAppApplication.class, args);
		System.out.println("***************************************************");
		System.out.println("it's working Perfectely !!! ");
	}
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
