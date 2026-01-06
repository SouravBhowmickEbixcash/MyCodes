package com.example.jpaTutorial.jpa_tutorial.controllers;

import com.example.jpaTutorial.jpa_tutorial.entities.Product;
import com.example.jpaTutorial.jpa_tutorial.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts(){
        return productRepository.findByTitleOrderByPrice("Sprite");
    }
}
