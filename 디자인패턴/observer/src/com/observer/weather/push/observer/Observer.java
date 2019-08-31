package com.observer.weather.push.observer;

public interface Observer {

    public void update(float temp, float humid, float pressure);

}
