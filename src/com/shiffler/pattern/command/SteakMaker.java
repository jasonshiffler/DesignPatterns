/**
 * The SteakMaker will abstract all the complexity of cooking a steak from the kitchen controller so that only the
 * execute command has to be called to make a steak
 */

package com.shiffler.pattern.command;

public class SteakMaker implements Command {

    Kitchen kitchen; //This is the kitchen we'll be sending commands to

    public SteakMaker(){
        this.kitchen = new Kitchen();
    }

    /**
     * Runs all the steps necessary to cook a steak.
     */
    @Override
    public void execute() {
        kitchen.setGrillOn();
        kitchen.setRefrigeratorOpen();
        kitchen.removeItemFromFridge("Steak");
        kitchen.setRefrigeratorClosed();
        kitchen.putItemOnGrill("Steak");

        try{Thread.sleep(3000);}
        catch (Exception e){}

        kitchen.removeItemFromGrill("Steak");
        kitchen.setGrillOff();
    }

    /**
     * Undo doesn't make much sense in this example but it's not uncommon with the command pattern.
     */
    @Override
    public void undo() {
        System.out.println("We can't uncook a steak!");

    }
}
