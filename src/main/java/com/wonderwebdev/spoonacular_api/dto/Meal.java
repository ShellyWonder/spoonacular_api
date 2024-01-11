package com.wonderwebdev.spoonacular_api.dto;

public class Meal {
private int id;
private String imageType;
private String title;
private int readyInMinutes;
private int servings;
private String sourceUrl;

public Meal(int id, String imageType, String title, int readyInMinutes, int servings, String sourceUrl) {
	super();
	this.id = id;
	this.imageType = imageType;
	this.title = title;
	this.readyInMinutes = readyInMinutes;
	this.servings = servings;
	this.sourceUrl = sourceUrl;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getImageType() {
	return imageType;
}

public void setImageType(String imageType) {
	this.imageType = imageType;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getReadyInMinutes() {
	return readyInMinutes;
}

public void setReadyInMinutes(int readyInMinutes) {
	this.readyInMinutes = readyInMinutes;
}

public int getServings() {
	return servings;
}

public void setServings(int servings) {
	this.servings = servings;
}

public String getSourceUrl() {
	return sourceUrl;
}

public void setSourceUrl(String sourceUrl) {
	this.sourceUrl = sourceUrl;
}

@Override
public String toString() {
	return "Meal [id=" + id + ", imageType=" + imageType + ", title=" + title + ", readyInMinutes=" + readyInMinutes
			+ ", servings=" + servings + ", sourceUrl=" + sourceUrl + ", getId()=" + getId() + ", getImageType()="
			+ getImageType() + ", getTitle()=" + getTitle() + ", getReadyInMinutes()=" + getReadyInMinutes()
			+ ", getServings()=" + getServings() + ", getSourceUrl()=" + getSourceUrl() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}
