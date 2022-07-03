package com.luv2code.springdemo;

public class WrestlingCoach implements Coach {

	private FortuneService fortuneService;
	
	public WrestlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 2 hours of boxing";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
