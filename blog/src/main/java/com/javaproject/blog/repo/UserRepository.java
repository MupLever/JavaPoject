package com.javaproject.blog.repo;

import org.springframework.data.repository.CrudRepository;

import com.javaproject.blog.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
