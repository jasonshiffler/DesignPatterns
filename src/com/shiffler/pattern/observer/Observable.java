/**
 * Our interface for an object that can send updates to observers when conditions change
 */

package com.shiffler.pattern.observer;

public interface Observable {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
