package com.shiffler.pattern.singleton;

public class MainSingle {

    public static void main(String[] args) {
        ChocolateBoiler cb1 = ChocolateBoiler.getInstance();
        ChocolateBoiler cb2 = ChocolateBoiler.getInstance();

        if (cb1 == cb2)
            System.out.println("It's the same object!");
    }

}
