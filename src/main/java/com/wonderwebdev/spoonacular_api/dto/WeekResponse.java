package com.wonderwebdev.spoonacular_api.dto;

public class WeekResponse {

	private Week week;

	public WeekResponse(Week week) {
		super();
		this.week = week;
	}

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}
	
	
}
