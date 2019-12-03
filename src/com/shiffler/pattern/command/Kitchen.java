/**
 * The kitchen will receive the commands that are needed to cook whatever we want.
 */

package com.shiffler.pattern.command;

public class Kitchen {

    public boolean grillOn;
    public boolean refridgeratorOpen;

    Kitchen(){
        grillOn = false;
        refridgeratorOpen = false;
    }

    public void removeItemFromFridge(String item){
        System.out.println( item + " has been removed from fridge");
    }

    public void putItemOnGrill(String item){
        System.out.println( item + " has been put on the grill");
    }

    public void removeItemFromGrill(String item){
        System.out.println( item + " has been removed from grill");
    }

    public void setGrillOn(){
        grillOn = true;
        System.out.println("Grill on");
    }

    public void setGrillOff(){
        grillOn = false;
        System.out.println("Grill off");
    }

    public void setRefrigeratorOpen(){
       refridgeratorOpen = true;
        System.out.println("Fridge is open");
    }

    public void setRefrigeratorClosed(){
        refridgeratorOpen = false;
        System.out.println("Fridge is closed");
    }

}
