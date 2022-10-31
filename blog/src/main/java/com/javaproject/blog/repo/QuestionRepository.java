package com.javaproject.blog.repo;
import org.springframework.data.repository.CrudRepository;

import com.javaproject.blog.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
    
}
