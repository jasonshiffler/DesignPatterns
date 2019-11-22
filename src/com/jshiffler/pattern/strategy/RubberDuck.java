package com.jshiffler.pattern.strategy;

public class RubberDuck extends Duck {

    public RubberDuck(){
        this.fb = new FlyNoWay();
        this.qb = new QuackSqueek();
    }



}
