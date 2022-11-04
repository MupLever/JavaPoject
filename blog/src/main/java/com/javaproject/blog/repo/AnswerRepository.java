package com.javaproject.blog.repo;
import org.springframework.data.repository.CrudRepository;

import com.javaproject.blog.models.Answer;
import com.javaproject.blog.models.Question;

import java.util.List;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
    List<Answer> getByQuestion(Question question);
}