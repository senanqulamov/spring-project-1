package com.company;

public class BaseballCoach implements Coach {
	private FortuneService ftService;

	public BaseballCoach(FortuneService theftService){
		this.ftService = theftService;
	}

	@Override
	public String getDailyWorkout() {

		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		return ftService.getFortune();
	}

}








