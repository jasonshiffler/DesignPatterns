/**
 * Runs the main program. Demonstrates weatherData being updated and how an observer responds to it.
 */

package com.jshiffler.pattern.observer;

public class WeatherStation {


    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80f,65f,30.4f);
        Thread.sleep(1000);
        weatherData.setMeasurements(81f,66f,30.2f);
        Thread.sleep(1000);
        weatherData.setMeasurements(82f,67f,30.1f);

    }
}
