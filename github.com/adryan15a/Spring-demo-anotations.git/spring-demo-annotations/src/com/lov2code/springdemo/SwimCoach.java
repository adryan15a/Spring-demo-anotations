package com.lov2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
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

	@Override
	public String getDailyWorkout() {
		return "Swimm 1000 meters for wormup!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
