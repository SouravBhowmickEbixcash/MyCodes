package com.example.jpaTutorial.jpa_tutorial;

import com.example.jpaTutorial.jpa_tutorial.entities.Product;
import com.example.jpaTutorial.jpa_tutorial.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaTutorialApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}


	@Test
	void testRepository() {
		Product product = Product.builder()
				.sku("nestle234")
				.title("Nestle Chocolate")
				.price(BigDecimal.valueOf(123.45))
				.quantity(12)
				.build();

		Product saved_product = productRepository.save(product);
		System.out.println(saved_product);
	}


	@Test
	void getRepository () {
		List<Product> products = productRepository.findAll();
		List<Product> productsByTitle = productRepository.findByTitle("Parle Buscuit");
		List<Product> productByCreatedAtAfter = productRepository.findByCreatedAtAfter(LocalDateTime.of(2025, 8, 25, 0, 0, 0));
		List<Product> productsByQuantityAndPrice = productRepository.findByQuantityAndPrice(4, BigDecimal.valueOf(12.00));
		System.out.println("Products By Title : " + productsByTitle);
		System.out.println("Products : " + products);
		System.out.println("Products By Created At After : " + productByCreatedAtAfter);
		System.out.println("Products By Quantity and Price : " + productsByQuantityAndPrice);
	}


	@Test
	void getSingleFromRepository(){
		Optional<Product> product = productRepository.findByTitleAndPrice("Pepsi", BigDecimal.valueOf(14.40));
		product.ifPresent(System.out :: println);
	}

}
