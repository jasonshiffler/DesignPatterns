package com.shiffler.pattern.factory;

public abstract class PizzaFactory {

    /**
     * Defines the steps that should happen for any Pizza. Since all pizzas are prepared with the same process
     * regardless of type we want to implement this method here so it is consistent across all Pizza factories
     *
     * @param type
     * @return - The output is a pizza
     */

    public Pizza orderPizza(String type){

        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    /**
     * This method actually creates the pizza. Because the Piazza Factory subclasses implement this method we can
     * create different types of Pizzas depending on the actual factory type.
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);

}
