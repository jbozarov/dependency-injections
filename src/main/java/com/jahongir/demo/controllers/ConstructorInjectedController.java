package com.jahongir.demo.controllers;

import org.springframework.stereotype.Controller;

import com.jahongir.demo.services.MyService;

@Controller
public class ConstructorInjectedController {

	private final MyService myService;
	
	public ConstructorInjectedController (MyService myService) {
		this.myService = myService; 
	}
	
	public String getMessage() {
		return myService.displayMessage("This is a ConstructorInjectedController");
	}
}
