package com.javaproject.blog.controllers;

import com.javaproject.blog.repo.QuestionRepository;
import com.javaproject.blog.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions")
	public String session(Model model) {
		Iterable<Question> questions = questionRepository.findAll();
		model.addAttribute("questions", questions);
		return "session";
	}
}
