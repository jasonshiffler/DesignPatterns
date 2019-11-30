package com.shiffler.pattern.factory;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Pizza";
        dough = "Extra Thick Crust";
        sauce = "Plum tomato sauce";

        topppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut(){
        System.out.println("cutting pizza into square slices");
    }

}
