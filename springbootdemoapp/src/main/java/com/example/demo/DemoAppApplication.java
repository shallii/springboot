package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoAppApplication.class, args);
		
		//Get the object from application context
		Student stuObj = ctx.getBean(Student.class);
		stuObj.show();
		
		System.out.println("Hello World");
	}

}
