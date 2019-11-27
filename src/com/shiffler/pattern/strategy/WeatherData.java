/**
 * This is our WeatherData object that allows objects that implement the observable interface to recieve condition
 * updates.
 */

package com.shiffler.pattern.strategy;

import java.util.ArrayList;

public class WeatherData implements Observable {

    private ArrayList<Observer> observers; // the list of of observers we'll need to notify when the weather changes
    private Float temperature;
    private Float humidity;
    private Float pressure;

    /**
     * Constructor
     */
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    /**
     * Allows an onbserver to register for updates
     * @param observer - the observer we need to notify
     */

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Allows an observer to no longer receive updates.
     * @param observer - The observer to be removed from the list
     */

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>= 0){
            observers.remove(i);
        }
    }

    /**
     * Update observers on the weather changes
     */
    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * What to do when the measurements are updated
     */

    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * Set our current measurements
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(Float temperature, Float humidity, Float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public Float getTemperature(){
        return temperature;
    }

    public Float getHumidity(){
        return humidity;
    }

    public Float getPressure(){
        return pressure;
    }
}
