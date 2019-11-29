package com.shiffler.pattern.decorator;

public class MainBeverage {


    public static void main(String[] args) {

        //Let's make a double mocha espress with Whip topping
        Beverage order = new Espresso();
        order = new Mocha(order);
        order = new Mocha(order);
        order = new Whip(order);

        System.out.println("You ordered " + order.getDescription());
        System.out.println("Your order total is "+ order.cost());


    }

}
