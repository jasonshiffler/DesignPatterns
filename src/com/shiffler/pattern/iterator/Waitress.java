/**
 * Because of the iterator our Waitress is able to print out the menus without having to understand how their data
 * structures work.
 */

package com.shiffler.pattern.iterator;
import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        System.out.println("Pancake Menu");
        Iterator<MenuItem> it = pancakeHouseMenu.createIterator();
        printMenu(it);

        System.out.println("Diner Menu");
        it = dinerMenu.createIterator();
        printMenu(it);

        System.out.println("Cafe Menu");
        it = cafeMenu.createIterator();
        printMenu(it);
    }

    private void printMenu(Iterator<MenuItem> it){
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
