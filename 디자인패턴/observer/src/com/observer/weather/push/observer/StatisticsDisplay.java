package com.observer.weather.push.observer;

import com.observer.weather.push.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humid;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humid, float pressure) {
        this.temp = temp;
        this.humid = humid;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("[StatisticsDisplay] : " + temp + " Celcious " + humid + "% " + pressure + " pressure");
    }
}
