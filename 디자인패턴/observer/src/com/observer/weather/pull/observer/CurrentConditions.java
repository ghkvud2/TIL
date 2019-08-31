package com.observer.weather.pull.observer;



import com.observer.weather.pull.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer, DisplayElement {

    private float temp;
    private float humid;
    private float pressure;
    private Observable observable;

    public CurrentConditions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("[CurrentConditions] : " + temp + " Celcious " + humid + "%");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humid = weatherData.getHumid();
            display();
        }
    }
}
