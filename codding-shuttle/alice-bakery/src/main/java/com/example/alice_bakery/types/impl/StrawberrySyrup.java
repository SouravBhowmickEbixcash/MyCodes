package com.example.alice_bakery.types.impl;

import com.example.alice_bakery.types.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@Qualifier("strawberrySyrup")
@ConditionalOnProperty(name = "cake.syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
