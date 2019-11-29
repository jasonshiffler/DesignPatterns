package com.shiffler.pattern.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flapping my wings!");
    }
}
