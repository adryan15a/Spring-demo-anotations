 package com.lov2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		
		
		SwimCoach theSwimCoach = context.getBean("swimCoach",SwimCoach.class);
		
		
		//Coach theFootballCoach = context.getBean("messi",Coach.class);
		
		//call a method on the bean
		System.out.println(theSwimCoach.getDailyWorkout());
		System.out.println(theSwimCoach.getDailyFortune());
		System.out.println("email:"+theSwimCoach.getEmail()+" team:"+theSwimCoach.getTeam());
		//System.out.println("email:"+theTennisCoach.getEmail()+" fullName:"+theTennisCoach.getFullName()+" phoneNumber:"+theTennisCoach.getPhoneNumber());
		//System.out.println(theFootballCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
