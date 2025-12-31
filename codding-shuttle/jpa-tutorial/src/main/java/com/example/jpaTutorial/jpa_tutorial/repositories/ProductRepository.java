package com.example.jpaTutorial.jpa_tutorial.repositories;

import com.example.jpaTutorial.jpa_tutorial.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);

    List<Product> findByCreatedAtAfter(LocalDateTime after);

    List<Product> findByQuantityAndPrice(int quantity, BigDecimal price);

    List<Product> findByQuantityGreaterThanAndPriceLessThan(int quantity, BigDecimal price);
}
