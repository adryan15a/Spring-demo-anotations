package com.lov2code.springdemo;

public class VoleyCoach implements Coach {
	
	FortuneService fortuneService;
	
	public VoleyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
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

	@Override
	public String getDailyWorkout() {
		return "Practice hard on your throwing";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
