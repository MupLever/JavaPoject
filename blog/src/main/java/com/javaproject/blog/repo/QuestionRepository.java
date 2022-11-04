package com.javaproject.blog.repo;
import org.springframework.data.repository.CrudRepository;

import com.javaproject.blog.models.Question;
import com.javaproject.blog.models.User;
import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Long> {
    List<Question> findByAuthor(User author);
}
