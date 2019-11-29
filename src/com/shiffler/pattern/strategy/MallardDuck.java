package com.shiffler.pattern.strategy;

public class MallardDuck extends Duck{

    //Setup the Mallard with default behavior for a Mallard
    public MallardDuck(){
        this.qb = new Quack();
        this.fb = new FlyWithWings();
    }

}
