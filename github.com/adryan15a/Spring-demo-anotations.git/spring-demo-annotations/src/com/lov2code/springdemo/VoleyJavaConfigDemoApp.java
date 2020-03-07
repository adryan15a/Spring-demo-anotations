package com.lov2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VoleyJavaConfigDemoApp {

	public static void main(String[]args) {
		//read spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		Coach theVoleyCoach = context.getBean("voleyCoach",Coach.class);
	
		//call a method on the bean
		System.out.println(theVoleyCoach.getDailyWorkout());
		System.out.println(theVoleyCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
