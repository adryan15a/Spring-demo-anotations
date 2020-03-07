package com.lov2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		
		//defalut @Component id is class name but with first lower case
		Coach thPoloCoach = context.getBean("poloCoach",Coach.class);
		
		//from Component id that i gave messi
		//Coach theFootballCoach = context.getBean("messi",Coach.class);
		
		//call a method on the bean
		System.out.println(thPoloCoach.getDailyWorkout());
		System.out.println(thPoloCoach.getDailyFortune());
		//System.out.println("email:"+theTennisCoach.getEmail()+" fullName:"+theTennisCoach.getFullName()+" phoneNumber:"+theTennisCoach.getPhoneNumber());
		//System.out.println(theFootballCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
