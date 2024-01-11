package com.wonderwebdev.spoonacular_api.dto;

public class Nutrients {
private float calories;
private float protein;
private float fat;
private float carbohydrates;


public Nutrients(float calories, float protein, float fat, float carbohydrates) {
	super();
	this.calories = calories;
	this.protein = protein;
	this.fat = fat;
	this.carbohydrates = carbohydrates;
}


public float getCalories() {
	return calories;
}


public void setCalories(float calories) {
	this.calories = calories;
}


public float getProtein() {
	return protein;
}


public void setProtein(float protein) {
	this.protein = protein;
}


public float getFat() {
	return fat;
}


public void setFat(float fat) {
	this.fat = fat;
}


public float getCarbohydrates() {
	return carbohydrates;
}


public void setCarbohydrates(float carbohydrates) {
	this.carbohydrates = carbohydrates;
}


@Override
public String toString() {
	return "Nutrients [calories=" + calories + ", protein=" + protein + ", fat=" + fat + ", carbohydrates="
			+ carbohydrates + "]";
}


}
