package com.wonderwebdev.spoonacular_api.dto;

import java.util.List;

public class DayResponse {
private List<Meal> meals;
private Nutrients nutrients;

public DayResponse(List<Meal> meals, Nutrients nutrients) {
	super();
	this.meals = meals;
	this.nutrients = nutrients;
}

public List<Meal> getMeals() {
	return meals;
}

public void setMeals(List<Meal> meals) {
	this.meals = meals;
}

public Nutrients getNutrients() {
	return nutrients;
}

public void setNutrients(Nutrients nutrients) {
	this.nutrients = nutrients;
}


}
