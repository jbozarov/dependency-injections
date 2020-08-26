package com.jahongir.demo.services;

public class ConstructorInjectedImplementation implements MyService{

	@Override
	public String displayMessage(String msg) {
		return "This is constructor implementations";
	}

	
}
