package com.jahongir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jahongir.demo.controllers.MessageController;
import com.jahongir.demo.service.MessageService;
import com.jahongir.demo.service.MessageServiceImplementation;

@SpringBootApplication
public class DependencyInjectionTypesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionTypesApplication.class, args);
		
		MessageController controller = (MessageController) context.getBean("messageController"); 
		
		System.out.println("This is a message from controller " + controller.getMessage());
		
		
		
		
	}

}
