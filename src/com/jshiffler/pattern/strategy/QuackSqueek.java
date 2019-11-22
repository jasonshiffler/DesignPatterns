package com.jshiffler.pattern.strategy;

public class QuackSqueek implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeek, Squeek");

    }
}
