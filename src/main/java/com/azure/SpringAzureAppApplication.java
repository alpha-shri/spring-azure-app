package com.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureAppApplication {

	@GetMapping("/home")
	public String homePage(){
		return "Congratts.. Application deployed successfully in MS Azure..";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureAppApplication.class, args);
	}

}
