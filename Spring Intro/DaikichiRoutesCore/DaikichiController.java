package com.javastack.spring.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
// Add the .../daikichi path mapping
	@RequestMapping("")
	public String daikichi() {
		return "HELLO";
	}
	// Add the .../today path mapping 
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
	// Add the .../tomorrow path mapping
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
	}
	// Add the .../travel/{city} path mapping	
 
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	// Add the .../lotto/{number} path mapping
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable int number) {
		
		if (number % 2 == 0) {
			return "<h1 style='color:red;'>You will take a grand journey in the near future, but be weary of tempting offers.</h1>";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}
}