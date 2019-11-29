/**
 * Concrete implementation of our Condiment Decorater
 *
 */

package com.shiffler.pattern.decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha (Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public Double cost() {
        return beverage.cost() + .20;
    }
}
