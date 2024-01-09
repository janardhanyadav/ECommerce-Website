package com.ECommerce.major.repository;

import com.ECommerce.major.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {
    List<Product> findAllByCategory_Id(int id);
}
