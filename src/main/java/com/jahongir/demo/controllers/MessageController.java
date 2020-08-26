package com.jahongir.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jahongir.demo.service.MessageService;

@Controller
public class MessageController {

	@Autowired
	MessageService messageService; 
	
	public String getMessage() {
		return messageService.displayMessage("I am a message implementation");
	}
}
