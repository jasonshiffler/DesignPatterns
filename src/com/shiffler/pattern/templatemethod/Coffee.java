package com.shiffler.pattern.templatemethod;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Pouring water through a filter filled with coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding creme and sugar");

    }
}
