package com.jahongir.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jahongir.demo.services.MyService;

@Controller
public class SetterController {

	@Autowired
	@Qualifier("setterImplementation")
	private MyService myService;

	public void setMyService( MyService myService) {
		this.myService = myService;
	} 
	
	public MyService getMyService() {
		return myService;
	}
	
}
