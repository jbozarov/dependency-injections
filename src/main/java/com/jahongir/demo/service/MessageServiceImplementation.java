package com.jahongir.demo.service;

public class MessageServiceImplementation implements MessageService {

	@Override
	public void displayMessage(String message) {
		
		System.out.println("Hello " + message);
		
	}

	
}
