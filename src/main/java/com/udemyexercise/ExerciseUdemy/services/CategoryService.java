package com.udemyexercise.ExerciseUdemy.services;

import com.udemyexercise.ExerciseUdemy.entities.Category;
import com.udemyexercise.ExerciseUdemy.entities.User;
import com.udemyexercise.ExerciseUdemy.repositories.CategoryRepositories;
import com.udemyexercise.ExerciseUdemy.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepositories repository;

    @GetMapping
    public List<Category> findAll(){
        return  repository.findAll();
    }

    public Category findById (Long id){
       Optional<Category> obj = repository.findById(id);
       return obj.get();

    }
}

