package com.String.Reverse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StringController {
	
	//http:localhost:8080/
	@GetMapping("/")
	public String showForm() {
		return "input-form";
	}
	
	//http:localhost:8080/process
	@PostMapping("/process")
	public String processString(@RequestParam("original") String original, Model model) {
		String reversed = new StringBuilder(original).reverse().toString();
		model.addAttribute("original", original);
		model.addAttribute("reversed", reversed);
		return "result-page";
	}
	
}
