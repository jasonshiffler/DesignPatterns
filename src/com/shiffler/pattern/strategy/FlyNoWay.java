package com.shiffler.pattern.strategy;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
