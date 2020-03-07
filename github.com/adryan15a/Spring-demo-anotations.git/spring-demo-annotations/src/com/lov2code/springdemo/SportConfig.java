package com.lov2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.lov2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for sadFortuneService
	@Bean
	public FortuneService sadfortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public FortuneService zodiacFortuneService() {
		return new ZodiacFortuneService();
	}
	
	//define bean for our sim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadfortuneService());
	}
	
	@Bean
	public Coach voleyCoach() {
		return new VoleyCoach(zodiacFortuneService());
	}
	
}
