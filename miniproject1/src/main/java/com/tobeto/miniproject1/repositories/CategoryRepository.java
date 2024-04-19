package com.tobeto.miniproject1.repositories;

import com.tobeto.miniproject1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Integer> {
}
