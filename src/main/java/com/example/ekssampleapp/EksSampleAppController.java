package com.example.ekssampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EksSampleAppController {

	@GetMapping("/")
	public String logData() {
		
		System.out.println("Logging is enabled.");
		
		return "app is working";
	}
}
