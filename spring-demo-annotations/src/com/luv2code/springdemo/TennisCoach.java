package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFileFortuneService")
	private FortuneService fortuneService;

/*	@Autowired
	public TennisCoach(FortuneServiceImpl fortuneService) {
		this.fortuneService = fortuneService;
	}*/

/*	@Autowired
	public void setFortuneService(FortuneServiceImpl fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
