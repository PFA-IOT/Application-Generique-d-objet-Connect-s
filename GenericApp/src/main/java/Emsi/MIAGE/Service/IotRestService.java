package Emsi.MIAGE.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IotRestService {
	
	@GetMapping("/hello")
	public String hello()
	{ 
		return "hello this is a Restfull Controller ";
	}

}