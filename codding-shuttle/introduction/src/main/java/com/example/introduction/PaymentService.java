package com.example.introduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @PostConstruct
    public void afterInit(){
        System.out.println("Before Paying...");
    }

    public void pay(){
        System.out.println("Paying...");
    }


    @PreDestroy
    public void beforeDestroy () {
        System.out.println("After paying...");
    }
}
