package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theCricketCoach")
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println(">> CricketCoach: inside default constructor");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> CricketCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> CricketCoach: inside doSomeCrazyStuff");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do practice of batting for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
