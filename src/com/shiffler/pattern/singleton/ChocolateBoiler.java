/**
 * This is our Chocolate Boiler Singleton API. It' makes sure that there is one object controlling the boiler.
 */

package com.shiffler.pattern.singleton;

import com.shiffler.pattern.observer.DisplayElement;

public class ChocolateBoiler {
    private Boolean empty;
    private Boolean boiled;

    private static ChocolateBoiler cb;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    /**
     * This is where the Singleton magic happens. If the Boiler hasn't been created we create it.
     * Also the same object is always returned!
     * synchronization assures that in a multi-threaded app we don't end up creating two objects.
     * @return
     */
    public static synchronized ChocolateBoiler getInstance(){

        if (cb == null) {
            cb = new ChocolateBoiler();
        }
            return cb;
    }

    /**
     * Fill the Chocolate Boiler!
     */
    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    /**
     * Drain the mixture after it has been cooked
     *
     */
    public void drain(){
        if(!isEmpty() && isBoiled())
            empty = true;
    }

    public Boolean isEmpty(){
        return empty;
    }

    public Boolean isBoiled(){
        return boiled;
    }

}
