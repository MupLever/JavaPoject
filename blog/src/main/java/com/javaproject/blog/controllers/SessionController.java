package com.javaproject.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {
    @GetMapping("/session")
	public String session(Model model) {
		model.addAttribute("title", "Авторизация");
		return "session";
	}
}
