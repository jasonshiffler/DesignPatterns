package com.shiffler.pattern.factory;

public class NYPizzaFactory extends PizzaFactory {


    @Override
    Pizza createPizza(String type){
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        else {
            return new NYStyleCheesePizza();
        }
    }

}
