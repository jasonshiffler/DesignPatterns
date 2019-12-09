/**
 * The PancakeHouseMenu stores its data in an ArrayList format
 */

package com.shiffler.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

    private ArrayList<MenuItem> menuItems; // Holds all of the items on our menu

    /**
     * Constructor
     */
    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast",
                true, 2.99f);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage",
                false, 2.99f);

        addItem("Blueberry Pancakes", "Pancakes with blueberries",
                true, 3.49f);

        addItem("Waffles", "Waffles with blueberries or strawberries",
                true, 3.59f);
    }

    /**
     * Allows us to add an item to the menu
     * @param name Name of the menu item
     * @param description description of the menu item
     * @param vegetarian is the item vegetarian or not
     * @param price the cost of the item
     */
    public void addItem(String name, String description, Boolean vegetarian, Float price ){
        MenuItem tempItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(tempItem);
    }

    /**
     * Return the List of menu items
     */
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * A Factory method to create an Iterator for iterating through the menu items. We're pushing the responsibility
     * of iterating through our menu items off to another class
     * @return - An iterator for the PancakeMenu
     */

    public Iterator<MenuItem> createIterator(){

        return menuItems.iterator();

    }


}
