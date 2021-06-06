package com.lov2code.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;

	}

	public String getDailyWorkout() {
		return "Baseball: Spend 30 mintues on batting practice";
	}
// baseball class

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune

		return fortuneService.getFortune();
	}
}
