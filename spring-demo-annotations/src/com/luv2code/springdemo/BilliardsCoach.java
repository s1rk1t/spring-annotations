package com.luv2code.springdemo;

public class BilliardsCoach implements Coach {

	private FortuneService fortuneService;

	public BilliardsCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Play five games of eight ball, and five games of nine ball";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
