package com.jahongir.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jahongir.demo.services.PropertyInjectedService;

@Controller
public class PropertyInjectedController {

	@Autowired
	PropertyInjectedService messageService; 
	
	public String getMessage() {
		return messageService.displayMessage("I am a message implementation");
	}
}
