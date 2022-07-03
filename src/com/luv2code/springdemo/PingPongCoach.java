package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class PingPongCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public PingPongCoach() {
		System.out.println(">> PingPongCoach: inside default constructor");
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("PingPongCoach >> Intialization method");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("PingPongCoach >> Destroy method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
