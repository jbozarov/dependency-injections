package com.jahongir.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyImplementation implements MyService {

	MyService myService;

	@Override
	public String displayHello() {
		
		return "I am PropertyImplementation class";
	} 
	
}
