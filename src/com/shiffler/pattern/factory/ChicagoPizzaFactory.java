package com.shiffler.pattern.factory;

public class ChicagoPizzaFactory extends PizzaFactory {

    @Override
    Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(type.equals("sausage")){
            return new ChicagoStyleSausagePizza();
        }
        else {
            return new ChicagoStyleCheesePizza();
        }
    }

}
