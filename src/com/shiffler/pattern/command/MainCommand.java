/**
 * This is the main program that at present is configured to cook a steak. It could be reprogrammed dynamically if
 * we wanted to if wanted it to perform some other command.
 */

package com.shiffler.pattern.command;

public class MainCommand {

    public static void main(String[] args) {
        Command steakMaker = new SteakMaker(); //Create our Command Object
        KitchenController controller = new KitchenController(steakMaker); // Create the Kitchen controller and feed it
                                                                           // our command
        controller.Button1(); //Push the button and watch what happens

    }
}
