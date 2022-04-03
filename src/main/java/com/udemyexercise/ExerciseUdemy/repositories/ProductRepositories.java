package com.udemyexercise.ExerciseUdemy.repositories;

import com.udemyexercise.ExerciseUdemy.entities.Category;
import com.udemyexercise.ExerciseUdemy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositories extends JpaRepository<Product, Long> {
}
