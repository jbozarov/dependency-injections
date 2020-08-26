package com.jahongir.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImplementation implements MessageService {

	@Override
	public String displayMessage(String message) {
		
		return "Hello " + message; 
		
	}

	
}
