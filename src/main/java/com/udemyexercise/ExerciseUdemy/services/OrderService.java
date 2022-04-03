package com.udemyexercise.ExerciseUdemy.services;

import com.udemyexercise.ExerciseUdemy.entities.Order;
import com.udemyexercise.ExerciseUdemy.entities.User;
import com.udemyexercise.ExerciseUdemy.repositories.OrderRepositories;
import com.udemyexercise.ExerciseUdemy.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepositories repository;

    @GetMapping
    public List<Order> findAll(){
        return  repository.findAll();
    }

    public Order findById (Long id){
       Optional<Order> obj = repository.findById(id);
       return obj.get();

    }
}

