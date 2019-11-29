/**
 * Our display that implements the Observer interface so that it can be updated with weather conditions change.
 */

package com.shiffler.pattern.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Float temperature;
    private Float humidity;
    private Observable weatherData;


    /**
     * The constructor
     * @param weatherData - the weatherData object we'd like to track
     */
    public CurrentConditionDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this); //Let the weather data object know we'd like updates
    }

    /**
     * Display our current conditions
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");
    }

    /**
     * Update our Display with new data and then output the data.
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
