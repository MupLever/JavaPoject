package com.javaproject.blog.repo;
import org.springframework.data.repository.CrudRepository;

import com.javaproject.blog.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
    
}