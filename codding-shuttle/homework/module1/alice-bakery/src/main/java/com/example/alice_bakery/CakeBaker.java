package com.example.alice_bakery;

import com.example.alice_bakery.types.Frosting;
import com.example.alice_bakery.types.Syrup;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }

    @PostConstruct
    void init () {
        System.out.println("Setting up the cake baker shop !!");
    }

    public void bakeCake(){
        System.out.println("Baking the cake with "+ frosting.getFrostingType() + " and " + syrup.getSyrupType() + "!!");
    }


    @PreDestroy
    void destroy () {
        System.out.println("Closing the cake baker shop");
    }
}
