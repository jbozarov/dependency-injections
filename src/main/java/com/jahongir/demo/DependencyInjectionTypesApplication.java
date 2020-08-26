package com.jahongir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jahongir.demo.controllers.ConstructorInjectedController;
import com.jahongir.demo.controllers.MyController;
import com.jahongir.demo.services.MyService;
import com.jahongir.demo.services.MyServiceImplementation;

@SpringBootApplication
public class DependencyInjectionTypesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionTypesApplication.class, args);
		
		// Using tightly coupled injection
		MyController controller = (MyController) context.getBean("myController"); 
		System.out.println("This is a message from controller " + controller.getMessage());
		
		// Using constructor injection 
		ConstructorInjectedController constructorInjectedController = new ConstructorInjectedController(new MyServiceImplementation()); 
		System.out.println(constructorInjectedController.getMessage());
		
		
	}

}
