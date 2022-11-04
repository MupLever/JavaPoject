package com.javaproject.blog.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.javaproject.blog.models.Question;
import com.javaproject.blog.models.User;
import com.javaproject.blog.repo.QuestionRepository;


@Controller
public class MainController {
	@Autowired
    private QuestionRepository questionRepository;

	@GetMapping("/")
	public String home(Map<String, Object> model) {
		Iterable<Question> questions = questionRepository.findAll();
		model.put("questions", questions);
		return "home";
	}
	@GetMapping("/main")
	public String main(@AuthenticationPrincipal User user, Map<String, Object> model) {
		Iterable<Question> questions = questionRepository.findByAuthor(user);
		model.put("questions", questions);
		return "main";
	}
}