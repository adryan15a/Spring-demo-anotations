package com.lov2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	//seting values from file
	@Value("${fortune1}")
	private String a;
	@Value("${fortune2}")
	private String b;
	@Value("${fortune3}")
	private String c;
	@Value("${fortune4}")
	private String d;
	//load method for stacking fortunes from sport.fortunes
	private String[] arr;
	
	private Random myRandom = new Random();
	
    public void setupMyData() {
        arr = new String[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d; 
    } 
	
	@Override
	public String getFortune() {
		//load the array
		setupMyData();
		//pick a random string from the array
		int index = myRandom.nextInt(arr.length);
		String theFortune = arr[index];
		return theFortune;
	}

}
