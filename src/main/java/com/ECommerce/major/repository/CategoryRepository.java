package com.ECommerce.major.repository;

import com.ECommerce.major.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {


    Optional<Category> findAllById(int id);
}
