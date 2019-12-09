/**
 * The Diner Menu is implemented using an Array to hold all of its menu items.
 */

package com.shiffler.pattern.iterator;

public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {

        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fakin' Bacon with lettuce and tomato on whole wheat",
                true, 2.99f);

        addItem("BLT", "Bacon with lettuce and tomato on whole wheat",
                false, 2.99f);

        addItem("Soup of the day", "Soup of the day with a side of potato salad",
                false, 3.29f);

        addItem("Hotdog", "A hot dog with saurkraut, relish, onions, topped with cheese",
                false, 3.05f);
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
        if (numberOfItems == MAX_ITEMS){
            System.err.println("Menu is full, can't add anything else to it");
        }
        menuItems[numberOfItems] = tempItem;
        numberOfItems++;
    }

    /**
     * Returns the array of menu items
     * @return the array of the menu items
     */
    public MenuItem[] getMenuItems(){
        return menuItems;
    }

    /**
     * Creates an iterator to iterate through the menu items
     *
     * @return - An Iterator for the DinerMenu
     */
    public Iterator<MenuItem> createIterator(){
        return new DinerMenuIterator(menuItems);
    }


}
