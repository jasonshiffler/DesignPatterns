package com.shiffler.pattern.factory;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza(){
        name = "NY Style Pepperoni Pizza";
        dough = "Thin crust";
        sauce = "Marinara sauce";

        topppings.add("Grated Reggiano Cheese");
        topppings.add("Pepperoni");
    }

}
