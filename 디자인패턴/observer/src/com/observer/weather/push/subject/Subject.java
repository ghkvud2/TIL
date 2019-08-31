package com.observer.weather.push.subject;

import com.observer.weather.push.observer.Observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
