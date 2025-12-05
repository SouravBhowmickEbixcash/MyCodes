package com.example.alice_bakery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakeryApplication implements CommandLineRunner {
	private final CakeBaker cakeBaker;

	public AliceBakeryApplication (CakeBaker cakeBaker){
		this.cakeBaker = cakeBaker;
	}

	public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

	/**
	 * Callback used to run the bean.
	 *
	 * @param args incoming main method arguments
	 * @throws Exception on error
	 */
	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
