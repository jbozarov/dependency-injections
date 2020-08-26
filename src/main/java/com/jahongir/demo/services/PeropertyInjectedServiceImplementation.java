package com.jahongir.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PeropertyInjectedServiceImplementation implements PropertyInjectedService {

	@Override
	public String displayMessage(String message) {
		
		return "Hello " + message; 
		
	}

	
}
