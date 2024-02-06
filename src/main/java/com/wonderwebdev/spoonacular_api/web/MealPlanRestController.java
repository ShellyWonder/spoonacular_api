package com.wonderwebdev.spoonacular_api.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class MealPlanRestController {
	
	@Value("${spoonacular.api.key}")
    private String apiKey;

    @Value("${spoonacular.base.url}")
    private String baseUrl;

    @Value("${spoonacular.mealplan.path}")
    private String path;
    
	 private static final Logger logger = LoggerFactory.getLogger(MealPlanRestController.class);

	 @GetMapping("/mealplanner/week")
	    public ResponseEntity<String> getWeekMeals(
	            @RequestParam(value = "targetCalories", required = false) String numCalories,
	            @RequestParam(required = false) String diet,
	            @RequestParam(value = "exclude", required = false) String exclusions) {
	        
	        URI uri = buildUri("week", numCalories, diet, exclusions);
	        return makeRequest(uri);
	    }

	    @GetMapping("/mealplanner/day")
	    public ResponseEntity<String> getDayMeals(
	            @RequestParam(value = "targetCalories", required = false) String numCalories,
	            @RequestParam(required = false) String diet,
	            @RequestParam(value = "exclude", required = false) String exclusions) {

	        URI uri = buildUri("day", numCalories, diet, exclusions);
	        return makeRequest(uri);
	    }

	    private URI buildUri(String timeFrame, String numCalories, String diet, String exclusions) {
	        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl + path)
	                .queryParam("apiKey", apiKey)
	                .queryParam("timeFrame", timeFrame);

	        if (numCalories != null && !numCalories.isEmpty()) {
	            builder.queryParam("targetCalories", numCalories);
	        }
	        if (diet != null && !diet.isEmpty()) {
	            builder.queryParam("diet", diet);
	        }
	        if (exclusions != null && !exclusions.isEmpty()) {
	            builder.queryParam("exclude", exclusions);
	        }

	        URI uri = builder.build().toUri();
	        logger.info("Requesting URI: {}", uri.toString());
	        return uri;
	    }

	    private ResponseEntity<String> makeRequest(URI uri) {
	        RestTemplate restTemplate = new RestTemplate();
	        return restTemplate.getForEntity(uri, String.class);
	    }
	
}
