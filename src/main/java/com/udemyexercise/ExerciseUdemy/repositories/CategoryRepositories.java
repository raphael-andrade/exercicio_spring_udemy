package com.udemyexercise.ExerciseUdemy.repositories;

import com.udemyexercise.ExerciseUdemy.entities.Category;
import com.udemyexercise.ExerciseUdemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositories extends JpaRepository<Category, Long> {
}
