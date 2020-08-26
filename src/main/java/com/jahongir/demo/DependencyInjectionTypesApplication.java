package com.jahongir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jahongir.demo.service.MessageServiceImplementation;

@SpringBootApplication
public class DependencyInjectionTypesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionTypesApplication.class, args);
		
		MessageServiceImplementation messageServiceImplementation = new MessageServiceImplementation(); 
		messageServiceImplementation.displayMessage("Tight Coupling!");
	}

}
