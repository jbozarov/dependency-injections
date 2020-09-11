package com.jahongir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.jahongir.demo.controller.ConstructorController;
import com.jahongir.demo.controller.MyController;
import com.jahongir.demo.controller.PropertyController;
import com.jahongir.demo.controller.SetterController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jahongir.demo", "some.more.packages"})
public class DependencyInjectionTypesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionTypesApplication.class, args);
		

		MyController myController = ( MyController ) context.getBean("myController"); 
		System.out.println(myController.getDisplayHello());

		PropertyController propertyController = (PropertyController) context.getBean("propertyController"); 
		System.out.println(propertyController.getDisplayHello());

		ConstructorController constructorController = (ConstructorController) context.getBean("constructorController"); 
		System.out.println(constructorController.getDisplayHello());
		
		SetterController setterController = (SetterController) context.getBean("setterController"); 
		System.out.println(setterController.getMyService().displayHello());
		
	}

}
