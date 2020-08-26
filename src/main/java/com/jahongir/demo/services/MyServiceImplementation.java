package com.jahongir.demo.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImplementation implements MyService {

	@Override
	public String displayMessage(String message) {
		
		return "Hello " + message; 
		
	}

	
}
