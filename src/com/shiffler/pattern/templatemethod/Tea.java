package com.shiffler.pattern.templatemethod;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Soaking tea bag in hot water");

    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Honey");

    }
}
