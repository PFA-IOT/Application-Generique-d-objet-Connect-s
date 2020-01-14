package Emsi.MIAGE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestNotificationApplication.class, args);
		System.out.println("Rest Service Build ! ");
	}

}
