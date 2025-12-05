package com.example.alice_bakery.config;


import com.example.alice_bakery.CakeBaker;
import com.example.alice_bakery.types.Frosting;
import com.example.alice_bakery.types.Syrup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    CakeBaker getCakeBaker(Frosting frosting, Syrup syrup){
        return new CakeBaker(frosting, syrup);
    }
}
