/**
 * Here's a menu that uses a Hash Map to store its menu items. It's a bit of a contrived example but shows the power
 * of the iterator pattern to decouple accessing the data from the data structure itself.
 */

package com.shiffler.pattern.iterator;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {

    HashMap<String, MenuItem> menuItems = new HashMap<String,MenuItem>();

    public CafeMenu(){
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,3.99f);

        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                true,3.69f);

        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,4.29f);
    }

    /**
     * Add an item to the menu
     * @param name - name of the menu item
     * @param description - description of the item
     * @param vegetarian - is the item vegetarian
     * @param price - the price of the item
     */

    public void addItem(String name, String description, Boolean vegetarian, Float price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    /**
     * Creates an iterator that iterates the list items on the menu
     * @return - the iterator
     */
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator(); // Just want to iterate the values, not the keys
    }
}
