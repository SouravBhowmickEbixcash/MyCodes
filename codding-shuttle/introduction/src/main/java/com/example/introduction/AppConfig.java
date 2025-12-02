package com.example.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
//    @Scope("prototype")
    PaymentService paymentService(){
        System.out.println("Inside bean creation....");
        return new PaymentService();
    }
}
