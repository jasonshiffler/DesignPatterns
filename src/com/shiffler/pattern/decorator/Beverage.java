/**
 * This is our beverage archetype
 *
 */

package com.shiffler.pattern.decorator;

public abstract class Beverage {

    protected String description;

    // Returns the drink description
    public String getDescription() {
        return  description;
    }

    //Returns the cost of the drink
    public abstract Double cost();

}
