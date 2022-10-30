package com.javaproject.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("title", "Регистрвция");
		return "registration";
	}
}
