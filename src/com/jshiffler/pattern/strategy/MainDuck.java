

package com.jshiffler.pattern.strategy;

public class MainDuck {

    public static void main(String[] args) {

        //Create the Duck
        Duck duck = new RubberDuck();

        //Have the Duck perform it's tricks
        duck.performFly();
        duck.performQuack();

        //Morph the duck behavior
        duck.setQuackBehavior(new Quack());
        duck.setFlyBehavior(new FlyWithWings());

        //Have the Duck perform it's new tricks
        duck.performFly();
        duck.performQuack();

    }
}
