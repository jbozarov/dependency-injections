package com.jahongir.demo.controller;

import org.springframework.stereotype.Controller;


@Controller
public class MyController {
	
	public String getDisplayHello() {
		return "I am MyController"; 
	}
}
