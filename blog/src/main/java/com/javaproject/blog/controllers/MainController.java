package com.javaproject.blog.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

import com.javaproject.blog.models.Question;
import com.javaproject.blog.repo.QuestionRepository;
@Controller
public class MainController {
	@Autowired
    private QuestionRepository questionRepository;
	@GetMapping("/")
	public String home(Map<String, Object> model) {
		return "home";
	}
	@GetMapping("/main")
	public String main(Map<String, Object> model) {
		Iterable<Question> questions = questionRepository.findAll();
		model.put("questions", questions);
		return "main";
	}
}