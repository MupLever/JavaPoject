package com.javaproject.blog.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.javaproject.blog.models.Answer;
import com.javaproject.blog.repo.AnswerRepository;

@Controller
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping("/question")
	public String answers(Map<String, Object> model) {
		Iterable<Answer> answers = answerRepository.findAll();
		model.put("answers", answers);
		return "show_questions";
	}
}
