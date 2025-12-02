package com.example.introduction;

import com.example.introduction.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class IntroductionApplication implements CommandLineRunner {

	final PaymentService paymentService;

	final PaymentService paymentService2;

//	final NotificationService notificationService;
//
//	public IntroductionApplication (PaymentService paymentService, PaymentService paymentService2, NotificationService notificationService){
//		this.paymentService = paymentService;
//		this.paymentService2 = paymentService2;
//		this.notificationService = notificationService;
//	}

	@Autowired
	Map<String, NotificationService> notificationServiceMap;

	public IntroductionApplication (PaymentService paymentService, PaymentService paymentService2){
		this.paymentService = paymentService;
		this.paymentService2 = paymentService2;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(paymentService.hashCode());
//		System.out.println(paymentService2.hashCode());
		paymentService.pay();
//		notificationService.send("Hello");
		notificationServiceMap.forEach((k, v) -> {
			System.out.println(k);
			v.send("Hello");
		});
	}
}
