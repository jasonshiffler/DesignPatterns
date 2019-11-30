package com.shiffler.pattern.factory;

public class MainPizzaProgram {

    public static void main(String[] args) {

        PizzaFactory pFactory = new ChicagoPizzaFactory();

        Pizza pizza = pFactory.orderPizza("cheese");

        pFactory = new NYPizzaFactory();

        pizza = pFactory.orderPizza("cheese");


    }

}
