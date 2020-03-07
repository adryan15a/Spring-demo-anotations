package com.lov2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Default id with capital leters only if the first capital letter is folowed by another capital letter!";
	}

}
