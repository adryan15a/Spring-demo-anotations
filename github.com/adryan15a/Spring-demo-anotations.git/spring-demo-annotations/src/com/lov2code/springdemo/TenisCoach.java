package com.lov2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Constructor autowhired injection
@Component
@Scope("singleton")
public class TenisCoach implements Coach {
	
	private String email;
	
	private String fullName;
	
	private String phoneNumber;
	
	private FortuneService fortuneService;
	
	@Autowired
	public TenisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService,
			@Value("${email}")String email,@Value("${fullName}")String fullName,@Value("${phoneNumber}")String phoneNumber) {
		fortuneService = theFortuneService;
		this.email=email;
		this.fullName=fullName;
		this.phoneNumber=phoneNumber;
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupMethod() {
		System.out.println("we are starting");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupMethod() {
		System.out.println("we are cleaning");
	}
	
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand voley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getFullName() {
		return fullName;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}
