package com.shiffler.pattern.iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        System.out.println("Pancake Menu");
        Iterator<MenuItem> it = pancakeHouseMenu.createIterator();
        printMenu(it);

        System.out.println("Diner Menu");
        it = dinerMenu.createIterator();
        printMenu(it);
    }

    private void printMenu(Iterator<MenuItem> it){
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }


}
