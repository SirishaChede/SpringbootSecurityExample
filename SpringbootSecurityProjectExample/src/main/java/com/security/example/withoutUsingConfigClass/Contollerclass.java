package com.security.example.withoutUsingConfigClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/con")
public class Contollerclass {
	@GetMapping("/wel")
	public String welcome() {
		return "welcome";
	}

}
