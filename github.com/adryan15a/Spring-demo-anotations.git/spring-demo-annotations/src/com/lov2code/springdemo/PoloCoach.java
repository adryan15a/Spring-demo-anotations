package com.lov2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Field injection
@Component
public class PoloCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public PoloCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Practice swinging the club";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("polo couch getDalyFortune");
		return fortuneService.getFortune();
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
