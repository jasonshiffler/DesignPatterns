package com.shiffler.pattern.templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()){ //allows us to make this step optional if we want
            addCondiments();
        }
    }

   protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void pourInCup(){
        System.out.println("Pouring in Cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }

}
