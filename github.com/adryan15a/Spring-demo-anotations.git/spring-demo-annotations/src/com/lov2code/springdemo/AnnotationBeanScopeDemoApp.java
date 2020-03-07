package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("tenisCoach", Coach.class);
		
		Coach alphaCoach= context.getBean("tenisCoach", Coach.class);
		
		//check is they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the result of our comparison
		
	    System.out.println(result);
	    
	    System.out.println(theCoach);
	    System.out.println(alphaCoach);
		
		

	}

}
