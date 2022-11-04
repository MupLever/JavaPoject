package com.javaproject.blog.controllers;
import java.util.Map;
import com.javaproject.blog.repo.QuestionRepository;
import com.javaproject.blog.models.Question;
import com.javaproject.blog.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/show_questions")
	public String main(Map<String, Object> model) {
		Iterable<Question> questions = questionRepository.findAll();
		model.put("questions", questions);
		return "show_questions";
	}
	@GetMapping("/new_question")
	public String NewQuestion(Map<String, Object> model) {
		Iterable<Question> questions = questionRepository.findAll();
		model.put("questions", questions);
		return "new_question";
	}

	@PostMapping("/new_question")
	public String addNewQuestion(@AuthenticationPrincipal User user, @RequestParam String title, @RequestParam String text, Map<String, Object> model) {
		Question question = new Question(title, text, user);
		questionRepository.save(question);
		Iterable<Question> questions = questionRepository.findAll();
		model.put("questions", questions);
		return "main";
	}
}
