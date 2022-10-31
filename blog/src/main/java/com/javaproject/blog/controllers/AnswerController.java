package com.javaproject.blog.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javaproject.blog.models.Answer;
import com.javaproject.blog.repo.AnswerRepository;

@Controller
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping("/answers")
	public String session(Model model) {
		Iterable<Answer> answers = answerRepository.findAll();
		model.addAttribute("answers", answers);
		return "session";
	}
}
