package com.javaproject.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javaproject.blog.repo.UserRepository;

@Controller
public class UsersControllers {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Главная страница");
		return "home";
	}
}
