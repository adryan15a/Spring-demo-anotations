package com.lov2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//setter autowhired injection
@Component("messi")
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach() {
		// default constructor nececery!
		
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your driblling skills";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define a setter method
	@Autowired
	@Qualifier("happyFortuneService")
	public void shootAndDribble(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}
