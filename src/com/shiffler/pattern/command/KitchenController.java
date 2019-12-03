/**
 * Our Kitchen controller can be dynamically programed to run whatever we'd like.
 */


package com.shiffler.pattern.command;

public class KitchenController {

    Command command1;

    public KitchenController(Command command1){
        this.command1 = command1;
    }

    void Button1(){
        command1.execute();
    }

}
