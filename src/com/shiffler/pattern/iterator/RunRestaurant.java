package com.shiffler.pattern.iterator;

public class RunRestaurant {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress flo = new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        flo.printMenu();
    }


}
