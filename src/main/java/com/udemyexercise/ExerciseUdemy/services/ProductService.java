package com.udemyexercise.ExerciseUdemy.services;

import com.udemyexercise.ExerciseUdemy.entities.Product;
import com.udemyexercise.ExerciseUdemy.entities.User;
import com.udemyexercise.ExerciseUdemy.repositories.ProductRepositories;
import com.udemyexercise.ExerciseUdemy.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Service
public class ProductService {
    @Autowired
    private ProductRepositories repository;

    @GetMapping
    public List<Product> findAll(){
        return  repository.findAll();
    }

    public Product findById (Long id){
       Optional<Product> obj = repository.findById(id);
       return obj.get();

    }
}

