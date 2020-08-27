package com.jahongir.demo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterImplementation implements MyService{

	@Override
	public String displayHello() {
		
		return "I am SetterImplementation";
	}

}
