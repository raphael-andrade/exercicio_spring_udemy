package com.udemyexercise.ExerciseUdemy.repositories;

import com.udemyexercise.ExerciseUdemy.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositories extends JpaRepository<Order, Long> {
}
