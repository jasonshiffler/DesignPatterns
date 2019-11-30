/**
 * This is our archetype for a Pizza
 * Defines all the things that should happen for a Pizza
 */

package com.shiffler.pattern.factory;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> topppings = new ArrayList<>();

    void prepare(){

        System.out.println("Preparing " + name);
        System.out.println("Tossing dough....");
        System.out.println("Adding source....");
        System.out.println("Adding toppings: ");
        for (String topping: topppings)
            System.out.println(" " + topping);

    }

    void bake() {
        System.out.println("Bake at 450 for 15 minutes");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in Pizza Store box");
    }

    String getName(){
        return name;
    }

}
