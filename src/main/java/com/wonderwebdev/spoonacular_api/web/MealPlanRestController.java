package com.wonderwebdev.spoonacular_api.web;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

import com.wonderwebdev.spoonacular_api.dto.*;

@RestController
public class MealPlanRestController {
	
	@Value("${spoonacular.urls.base}")
	private String baseUrl;
	
	@Value("${spoonacular.urls.mealplan}")
	private String path;
	
	@Value("${spoonacular.api.key}")
	private String apiKey;

	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse>getWeekMeals(
			@RequestParam(value="targetCalories", required = false)String numCalories,
			@RequestParam(required = false)String diet,
			@RequestParam(value="exclude", required = false)String exclusions) throws MalformedURLException{
		
		RestTemplate rt =new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl + path)
				.queryParam("apiKey", apiKey)
				.queryParam("timeFrame", "week")
				.queryParam("targetCalories", numCalories, numCalories != null)
				.queryParam("diet", diet, diet != null)
				.queryParam("exclude", exclusions, exclusions != null)
				.build()
				.toUri();
		
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
				
		return response;
		
	}
	
	
	
}
