package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWhireDemoApp {

	public static void main(String[] args) {
		
		//**read spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		//**get the bean from spring container
		
		Coach theTenisCoach = context.getBean("tenisCoach",Coach.class);
		//Coach theFootballCoach = context.getBean("messi",Coach.class);
		//Coach thePoloCoch = context.getBean("poloCoach",Coach.class);
		
		//**run autoWhired method on bean
		//*constructor injection
	    System.out.println(theTenisCoach.getDailyFortune());
	    System.out.println("email:"+theTenisCoach.getEmail()+" fullName:"+theTenisCoach.getFullName()+" phoneNumber:"+theTenisCoach.getPhoneNumber());
		//*setter injection
		//System.out.println(theFootballCoach.getDailyFortune());
		//*Field injection
		//System.out.println(thePoloCoch.getDailyFortune());
		
		
		//**close the context
		context.close();
	}

}
