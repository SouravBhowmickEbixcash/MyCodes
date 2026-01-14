package com.example.jpaTutorial.jpa_tutorial.controllers;

import com.example.jpaTutorial.jpa_tutorial.entities.Product;
import com.example.jpaTutorial.jpa_tutorial.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    private final int PAGE_SIZE = 5;

    @GetMapping
    public List<Product> getAllProducts(@RequestParam(defaultValue = "") String title,
                                        @RequestParam(defaultValue = "id") String sortBy,
                                        @RequestParam(defaultValue = "0") Integer pageNumber){
        // --> Sorting
//        return productRepository.findBy(Sort.by(Sort.Direction.DESC, sortBy, "price"));
//        return productRepository.findBy(Sort.by(
//                Sort.Order.asc(sortBy),
//                Sort.Order.asc("title")));

        // --> Pagination
//        Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(Sort.Order.asc(sortBy)));
//        return productRepository.findAll(pageable).getContent();

        // --> Pagination - Sorting - Filter
        Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(Sort.Order.asc(sortBy)));
        return productRepository.findByTitleContainingIgnoreCase(title, pageable);
    }
}
