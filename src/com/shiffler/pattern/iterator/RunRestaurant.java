package com.shiffler.pattern.iterator;

public class RunRestaurant {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress flo = new Waitress(pancakeHouseMenu,dinerMenu);
        flo.printMenu();
    }


}
