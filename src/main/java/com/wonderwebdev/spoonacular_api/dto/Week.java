package com.wonderwebdev.spoonacular_api.dto;

public class Week {
private DayResponse monday;
private DayResponse tuesday;
private DayResponse wedesday;
private DayResponse thursday;
private DayResponse friday;
private DayResponse saturday;
private DayResponse sunday;

public Week(DayResponse monday, DayResponse tuesday, DayResponse wedesday, DayResponse thursday, DayResponse friday,
		DayResponse saturday, DayResponse sunday) {
	super();
	this.monday = monday;
	this.tuesday = tuesday;
	this.wedesday = wedesday;
	this.thursday = thursday;
	this.friday = friday;
	this.saturday = saturday;
	this.sunday = sunday;
}

public DayResponse getMonday() {
	return monday;
}

public void setMonday(DayResponse monday) {
	this.monday = monday;
}

public DayResponse getTuesday() {
	return tuesday;
}

public void setTuesday(DayResponse tuesday) {
	this.tuesday = tuesday;
}

public DayResponse getWedesday() {
	return wedesday;
}

public void setWedesday(DayResponse wedesday) {
	this.wedesday = wedesday;
}

public DayResponse getThursday() {
	return thursday;
}

public void setThursday(DayResponse thursday) {
	this.thursday = thursday;
}

public DayResponse getFriday() {
	return friday;
}

public void setFriday(DayResponse friday) {
	this.friday = friday;
}

public DayResponse getSaturday() {
	return saturday;
}

public void setSaturday(DayResponse saturday) {
	this.saturday = saturday;
}

public DayResponse getSunday() {
	return sunday;
}

public void setSunday(DayResponse sunday) {
	this.sunday = sunday;
}

@Override
public String toString() {
	return "Week [monday=" + monday + ", tuesday=" + tuesday + ", wedesday=" + wedesday + ", thursday=" + thursday
			+ ", friday=" + friday + ", saturday=" + saturday + ", sunday=" + sunday + "]";
}


}
