package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		System.out.println("inside tennis coach no arg constructor");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice serves and volleys for 2 hours";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("inside tennis coach fortune service setter");
//		this.fortuneService = theFortuneService;
//	}

//	@Autowired
//	public void doSomething(FortuneService theFortuneService) {
//		System.out.println("within the doSomething() method");
//		this.fortuneService = theFortuneService;
//
//	}

}
