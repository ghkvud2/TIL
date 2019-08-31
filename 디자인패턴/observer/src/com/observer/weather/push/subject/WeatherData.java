package com.observer.weather.push.subject;

import com.observer.weather.push.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temp;
    private float humid;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.removeIf(o -> o == observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temp, humid, pressure));
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float pressure) {
        this.temp = temp;
        this.humid = humid;
        this.pressure = pressure;
        measurementChanged();
    }

}
