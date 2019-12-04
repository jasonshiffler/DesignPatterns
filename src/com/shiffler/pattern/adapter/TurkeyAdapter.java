/**
 * Allows us to use a Turkey in place of a Duck
 */

package com.shiffler.pattern.adapter;

import com.shiffler.pattern.adapter.Duck;
import com.shiffler.pattern.adapter.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i< 5; i++){ //Turkeys can only fly short distances so we need to call the method
            turkey.fly();          //multiple times for them to go a decent distance
        }

    }
}
