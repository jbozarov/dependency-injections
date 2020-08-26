package com.jahongir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jahongir.demo.controllers.PropertyInjectedController;
import com.jahongir.demo.services.PropertyInjectedService;
import com.jahongir.demo.services.PeropertyInjectedServiceImplementation;

@SpringBootApplication
public class DependencyInjectionTypesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionTypesApplication.class, args);
		
		PropertyInjectedController controller = (PropertyInjectedController) context.getBean("propertyInjectedController"); 
		System.out.println("This is a message from controller " + controller.getMessage());
		
		
		
		
	}

}
