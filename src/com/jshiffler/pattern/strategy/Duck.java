//This is our Duck Super Type

package com.jshiffler.pattern.strategy;

public abstract class Duck {

    //We've encapsulated out the behaviors that are not shared across all ducks
    //Programing to an interface allows us to swap out the behaviors whenever we'd like to.
    QuackBehavior qb;
    FlyBehavior fb;

    public void performQuack(){
        qb.quack();
    }

    public void performFly(){
        fb.fly();
    }

    //We've left in behaviors that are shared so we benefit from reuse.
    public void swim() {
        System.out.println("All ducks can swim!");
    }

    //We can change behaviors at run time if we need to
    public void setQuackBehavior(QuackBehavior qb){
        this.qb = qb;
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.fb = fb;
    }


}
