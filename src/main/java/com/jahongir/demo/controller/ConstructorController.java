package com.jahongir.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jahongir.demo.services.MyService;

@Controller
public class ConstructorController {

	
	private final MyService myService; 
	
	public ConstructorController(@Qualifier("constructorInjectedImplementation") MyService myService) {
		this.myService = myService;
	}

	public String getDisplayHello() {
		return myService.displayHello(); 
	}
}
