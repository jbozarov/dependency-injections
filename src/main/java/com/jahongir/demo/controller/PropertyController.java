package com.jahongir.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jahongir.demo.services.MyService;

@Controller
public class PropertyController {

	@Autowired
	@Qualifier("propertyImplementation")
	MyService myService; 
	
	public String getDisplayHello() {
		return myService.displayHello(); 
	}
}
