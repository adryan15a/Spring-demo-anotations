package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		//defalut @Component id is class name but with first lower case
		Coach theTennisCoach = context.getBean("tenisCoach",Coach.class);
		
		//from Component id that i gave messi
		//Coach theFootballCoach = context.getBean("messi",Coach.class);
		
		//call a method on the bean
		System.out.println(theTennisCoach.getDailyWorkout());
		System.out.println(theTennisCoach.getDailyFortune());
		System.out.println("email:"+theTennisCoach.getEmail()+" fullName:"+theTennisCoach.getFullName()+" phoneNumber:"+theTennisCoach.getPhoneNumber());
		//System.out.println(theFootballCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
