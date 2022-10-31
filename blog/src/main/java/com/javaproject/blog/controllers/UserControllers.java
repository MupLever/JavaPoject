package com.javaproject.blog.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import com.javaproject.blog.repo.UserRepository;
// import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserControllers {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
	public String home(Map<String, Object> model) {
		model.put("title", "Главная страница");
		return "registration";
	}

	// @PostMapping
	// public String addNewUser(@RequestParam String email, @RequestParam String username, Map<String, Object> model) {
	// 	return "session";
	// }
}
