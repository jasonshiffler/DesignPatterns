/**
 * Concrete implementation of our Condiment Decorater
 *
 */

package com.shiffler.pattern.decorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    @Override
    public Double cost() {
        return beverage.cost() + .40;
    }
}
