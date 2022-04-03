package com.udemyexercise.ExerciseUdemy.services;

import com.udemyexercise.ExerciseUdemy.entities.User;
import com.udemyexercise.ExerciseUdemy.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositories repository;

    @GetMapping
    public List<User> findAll(){
        return  repository.findAll();
    }

    public User findById (Long id){
       Optional<User> obj = repository.findById(id);
       return obj.get();

    }
}

