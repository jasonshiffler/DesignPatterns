/**
 * This is our main program where we put our adapter into action
 */

package com.shiffler.pattern.adapter;

public class TestDrive {

    /**
     * We're going to use our adapter so our testDuck Method will work with a turkey which it would not normally
     * be compatible with
     * @param args
     */
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }


    /**
     * This Method only works with a ducks but using our adapter we can make it work with a Turkey
     * @param duck
     */
    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }

}
